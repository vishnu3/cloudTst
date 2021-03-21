package interview.programs.blackrock;

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



class Result {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY operations
     *  2. INTEGER_ARRAY x
     */
    public static long howManySwaps(List<Integer> arr) {
        // Write your code here
         CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>();
         arrayList.addAll(arr);


         int swap =0;


         for(int i =0 ; i <arrayList.size();i++){
             for(int j=i;j<arrayList.size();j++){

                if(arrayList.get(i)>arrayList.get(j)){
                    int l = new Integer(arrayList.get(i));
                    int k = new Integer(arrayList.get(j));


                    arrayList.remove(arrayList.get(i));
                    arrayList.remove(arrayList.get(j));

                    arrayList.add(i,k);
                    arrayList.add(j,l);
                    swap++;
                }

             }

         }




    return swap;


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));


        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long result = Result.howManySwaps(arr);

        System.out.println("result "+result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();




    }
}

