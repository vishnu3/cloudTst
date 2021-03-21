package interview.programs.arcesium;

import java.io.*;

public class testThree {

    public static int findMinDays(int n, int m) {
    int day =0;
    int start = n;
    int buyPrice = m;

    if(n==m){
       return 0;
    }

    if(n==0){
        if(m%2==0){
           day++;
        }

    }


       do {

           if (n < m) {
               if(n*2 == m) {
                   n = n*2;
                   day++;
               } else {
                   n = n - 1;
                   day++;
               }
           }else{
               if(n>m) {
                   n = n - 1;
                   day++;
               }
           }
       }while (!(n==m));

     return day;
    }





    public static void main(String[] args)throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        int res = findMinDays(n, m);

        System.out.println("res "+res);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}
