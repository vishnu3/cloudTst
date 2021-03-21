package interview.programs.enfusion;

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
     * Complete the 'substringCalculator' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static long substringCalculator(String s) {
        // Write your code here
        ArrayList<String> al = new ArrayList<>();
        for(int i =0; i<s.length();i++){
            for(int j =0;j<i;j++){
                String sub = s.substring(j,i+1);
                if(!al.contains(sub)){
                    al.add(sub);
                }
            }
        }

      return al.size()+s.chars().distinct().count();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        String s = bufferedReader.readLine();

        long result = Result.substringCalculator(s);
        System.out.println(" result "+result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
