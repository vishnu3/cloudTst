package interview.programs.line;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int solution(int[] n) {
        // write your code in Java 8
        int [] odd = new int[n.length/2];
        int [] even = new int[n.length/2];
        int l=0,m=0;

        for(int i=0;i<n.length;i++){
            if(i/2==0){
                even[l] = n[i];
                l++;
            }else{
                odd[m] = n[i];
                m++;
            }
        }

        int evenSum = Arrays.stream(even).sum();
        int oddSum = Arrays.stream(odd).sum();

        if(evenSum<oddSum){
           return oddSum;
        }else{
           return evenSum;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ënter size & element");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i =0 ; i<n;i++){
            int j =  in.nextInt();
             array[i] = j;

        }
        System.out.println(solution(array));
    }
}
