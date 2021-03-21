package interview.programs.arcesium;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class testOne {

    static int maxLength(List<Integer> arr) {
        int product =1;
        int max =0 ;
        int count =0;
        int loop=0;
        for(int i =0;i<arr.size(); i++){
            product = product*arr.get(i);
    loop++;
            if(i==0) {
                max = product;
                count++;
            }
            if(product>max){
                max = product;
               count++;
            }

        }

        if(loop == count){
         return 1;
        }else {
            return count;
        }


    }




    public static void main(String[] args)throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arrTemp = new ArrayList<>();

        IntStream.range(0, arrCount).forEach(i -> {
            try {
                arrTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> arr = arrTemp.stream()
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int res = maxLength(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
