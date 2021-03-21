package to60quen;

import java.util.Scanner;

public class ArmstrongExample{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =  in.nextInt();
        System.out.println("ArmsStrong  "+armsStrog(i));
    }

    static boolean armsStrog(int num){
    int c =0, a , temp;
    temp = num;
     while (num>0){
         a = num%10;
         num = num/10;
         c = c+(a*a*a);
     }

     if(c==temp){
         return true;
     }
     return false;


    }

}
