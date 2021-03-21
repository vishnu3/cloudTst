package hackerRank.tower;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class testThree {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        System.out.println(Arrays.stream("100100".split("")).map(i->Integer.parseInt(i)).collect(Collectors.toList()));
    }
}
