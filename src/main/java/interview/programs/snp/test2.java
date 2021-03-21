package interview.programs.snp;

import java.util.*;
import java.util.stream.Collectors;

public class test2 {
    public static  int solution(int N) {
        // write your code in Java SE 8
        int temp = N;
        StringBuilder str =  new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        do{
            arrayList.add(temp%10);
            temp = temp/10;

        }while (temp>0);

        arrayList = (ArrayList<Integer>) arrayList.stream().sorted().collect(Collectors.toList());

        for(int i =arrayList.size()-1;i>=0;i--){
            str.append(arrayList.get(i));
        }

        return  Integer.parseInt(str.toString());

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

        System.out.println(solution(n));
    }

}
