package interview.programs.goldman2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//brust and shrink problem

class Result {

    /*
     * Complete the 'getShrunkArray' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY inputArray
     *  2. INTEGER burstLength
     */

    public static List<String> getShrunkArray(List<String> inputArray, int burstLength) {
        List<String> outPut = new ArrayList<>();
        String s = String.join("",inputArray);
        System.out.println(" s "+s);
        List<String> tempList =  new ArrayList<>();
        //tempList.stream().


        for(int i = 0; i<inputArray.size();i++){
            if(i+burstLength<inputArray.size()) {
                System.out.println("i "+i+" burstLength - 1 "+(i+burstLength));
                String subString = s.substring(i, i+burstLength);
                System.out.println("subString "+subString);
                int count =0 ;

                if(Arrays.asList(subString.split("")).stream().distinct().count()==1){
                     count =0 ;
                     boolean adj = true;
                    for(int j= i+burstLength-1;j<inputArray.size();j++) {

                        if(j+1<inputArray.size()){
                        if (inputArray.get(j).equals(inputArray.get(j + 1)) && adj) {
                            count++;
                        } else {
                           // adj = false;
                            break;
                        }
                    }

                    }
                    int start = i;
                    int end = i+(burstLength-1)+count;
                    i = end;
                    for(int x = start;x<=end;x++){
                        tempList.remove(x);
                    }

                }
            }
        }


        return tempList;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));


        int inputArrayCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> inputArray = IntStream.range(0, inputArrayCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        int burstLength = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.getShrunkArray(inputArray, burstLength);

        System.out.println("result "+result);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
