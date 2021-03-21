package interview.programs.basics;

import java.util.Scanner;

public class PrimeTester {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("Enter number to check if prime or not ");

        while (number != 0) {
            number = scnr.nextInt();
            System.out.printf("Does %d is prime? %s", number, isPrimeOrNot(number));
            }
    }
    public static boolean isPrimeOrNot(int num){
        if(num==2 || num==3){
            return true;
        }
        if(num%2==0){
            return false;
        }

        int x = (int) Math.sqrt(num)+1;

        for(int i=3;i<x; i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
