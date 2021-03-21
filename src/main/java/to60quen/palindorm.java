package to60quen;

import java.util.Scanner;

public class palindorm {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("isPaindrom "+isPaindrom(s));
    }

    static boolean isPaindrom(String str){
       //StringBuilder temp = new StringBuilder(str);

//       if(str.equals(temp.reverse().toString())){
//          return true;
//       }

        return str.equals(new StringBuilder(str).reverse().toString())?true:false;

       //return false;


    }
}
