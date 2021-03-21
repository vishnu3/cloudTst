package to60quen;

import java.util.Scanner;

public class PrimeTester {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("isPrime "+isPrime(num));
    }
    static boolean isPrime(int num){
        if(num==2||num==3){
            return false;
        }
        if(num%2==0){
            return false;
        }

        int sqrt = (int) Math.sqrt(num)+1;

        for(int i =3; i<sqrt;i+=2){
            if(sqrt%i==0){
                return false;
            }

        }

        return false;

    }
}
