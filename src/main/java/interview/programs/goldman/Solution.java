package interview.programs.goldman;

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

public class Solution {



    // Complete the nonRepeatingDigitProductCount function below.
    static int nonRepeatingDigitProductCount(int x, int y, int z) {
        int count =0;

        for(int i= y;i<=z; i++){
            int product = x*i;
            int j = new Integer(i);
            ArrayList<Integer> pList = new ArrayList<>();
            do{
                pList.add(product%10);
                product = product/10;
            }while (product>0);

            ArrayList<Integer> xList = new ArrayList<>();
            do{
                xList.add(j%10);
                j = j/10;
            }while (j>0);

            if(Collections.disjoint(xList,pList)){
               count++;
            }

        }

      return count;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        int x = Integer.parseInt(bufferedReader.readLine().trim());

        int y = Integer.parseInt(bufferedReader.readLine().trim());

        int z = Integer.parseInt(bufferedReader.readLine().trim());

        int res = nonRepeatingDigitProductCount(x, y, z);

        System.out.println(" res "+res);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

