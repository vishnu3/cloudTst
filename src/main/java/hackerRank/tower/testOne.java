package hackerRank.tower;

import java.io.*;

public class testOne {

    public static String canReach(int x1,int  y1, int x2, int y2){
        int startX =x1;
        int startY = y1;
        int endX = x2;
        int endY = y2;
        int interX=0; int intterY = 0;


        boolean isRight = true;
        boolean isLeft = true;
        boolean test = true;
        String result = "No";

        while (test){
            interX = startX; intterY = startY;
            if(isLeft) {
                startX = startX + intterY;
            }

            if(isRight) {
                startY = startY + interX;
            }

         if(startX>x2){
             isLeft = false;
         }
         if(startY>y2){
             isRight =false;
         }

         if(startX==x2&&startY==y2){
             result = "Yes";
             break;
         }

         if(!isLeft){
             if(!isRight) {
                 result = "No";
                 break;
             }
         }
        }

      return result;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        int x1 = Integer.parseInt(bufferedReader.readLine().trim());

        int y1 = Integer.parseInt(bufferedReader.readLine().trim());

        int x2 = Integer.parseInt(bufferedReader.readLine().trim());

        int y2 = Integer.parseInt(bufferedReader.readLine().trim());

        String result = canReach(x1, y1, x2, y2);

        System.out.println("result-> "+result);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
