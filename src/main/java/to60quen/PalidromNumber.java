package to60quen;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;
import java.util.function.Predicate;

//check if number is pali
public class PalidromNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to check if palindrome");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        Predicate<Integer> p = i->{
            int reverse = 0;int number = i;
            do {
                int remainder = number%10;
                reverse = reverse*10+remainder;
                number = number/10;
            }while (number>0);

            if(i==reverse){
                return true;
            }else{
               return false;
            }
        };

        System.out.println(String.format("Number %d is palindrome  %s",num,p.test(num)));

    }

}
