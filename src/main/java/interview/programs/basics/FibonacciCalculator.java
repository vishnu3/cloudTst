package interview.programs.basics;

import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + number + " numbers : ");

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci2(i) + " ");
        }

    }

    public static int fibonacci2(int in) {
        int number = 1;
        if (in == 1 || in == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibo3 = 1;

        for (int i = 3; i < in; i++) {
            number = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = number;
        }
        return number;
    }
}

//    public static int fibonacci(int number){
//    if(number == 1 || number == 2)
//    { return 1; }
//    return fibonacci(number-1) + fibonacci(number -2);
//}


