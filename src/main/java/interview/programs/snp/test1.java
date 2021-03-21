package interview.programs.snp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test1 {
    public static int solution(int[] ranks) {
        // write your code in Java SE 8
        ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.stream(ranks).boxed().collect(Collectors.toList());
        ArrayList<Integer> rankList = (ArrayList<Integer>) arr.stream().distinct().collect(Collectors.toList());
        int count =0;

        for(Integer rank : rankList){
            if(arr.contains(rank+1)){
                count += Collections.frequency(arr,rank);
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = in.nextInt();


        }
        System.out.println(solution(x));
    }
}
