package interview.programs.ms;

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
    // Java program for Left Rotation and Right
// Rotation of a String

        // function that rotates s towards left by d
        static String leftrotate(String str, int d) {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
        }

        // function that rotates s towards right by d
        static String rightrotate(String str, int d) {
            return leftrotate(str, str.length() - d);
        }

        // Driver code
        public static void main(String args[]) {
            String str1 = "vishnu";
            System.out.println(leftrotate(str1, 2));

            String str2 = "";
            System.out.println(rightrotate(leftrotate(str1, 2), 4));
        }
    }

// This code is contributed by rachana soma

//
//    /*
//     * Complete the 'getShiftedString' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. STRING s
//     *  2. INTEGER leftShifts
//     *  3. INTEGER rightShifts
//     */
//
//    public static String getShiftedString(String s, int leftShifts, int rightShifts) {
//
//
//        String t= s.substring(0,leftShifts);
//        String l = s.substring(leftShifts,s.length());
//
//        String m = l+t;
//
//
//        String k = m.substring(0,rightShifts-1);
//        String d= m.substring(rightShifts-1,s.length());
//
//        String r = d+k;
//
//
//
//        return r;
//
//
//
//
//
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        File file = new File("C:/VishnuJ/test-projects/test-delete/testout.txt");
////        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
////
////        String s = bufferedReader.readLine();
//
////        int leftShifts = Integer.parseInt(bufferedReader.readLine().trim());
////
////        int rightShifts = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String result = Result.getShiftedString("vishnu", 2, 4);
//
//        System.out.println("result "+result);
//
//
//    }
