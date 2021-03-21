package hackerRank.tower;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class   test0 extends Exception{}
class   test2 extends test0{}

public class testTwo {

    public static int flowerBouquets(int p, int q, String s) {
        // Write your code here


        int[] test = Arrays.stream(s.split("")).mapToInt(i->Integer.parseInt(i)).toArray();


        LinkedList<Integer> input = new LinkedList<>();


        for(int i : test){
            input.add(i);
        }

        LinkedList<Integer> temp = new LinkedList<>();
        temp.addAll(input);

        List<Integer> profit = new ArrayList<>();


        for(int i =0 ; i<input.size();i++){
            Integer flw = input.get(i);


            switch (flw){
                case 0:
                    try {
                        if (input.get(i + 1) == 0 && input.get(i + 2) == 0) {
                            profit.add(p);
                        }
                        temp.remove(i);
                        temp.remove(i + 1);
                        temp.remove(i + 2);
                        i = i + 2;
                    }catch (Exception e){}
                    break;
                case 1:
                    try {
                        int tempEle = -1;
                        try {
                            tempEle = temp.get(i - 1);
                        } catch (Exception e) {
                        }
                        if (tempEle == 0) {
                            profit.add(q);
                            i = i;
                            temp.remove(i - 1);
                            temp.remove(i);
                        } else {
                            if (input.get(i + 1) == 0) {
                                profit.add(q);
                                i = i + 1;
                                temp.remove(i + 1);
                                temp.remove(i);
                            }
                        }
                    }catch (Exception e){}
                    break;
            }




        }

        return profit.stream().mapToInt(i->i).sum();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = flowerBouquets(p, q, s);

        System.out.println("result-> "+result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();


    }
}
