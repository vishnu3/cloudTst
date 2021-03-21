package interview.programs.snp;

import com.fasterxml.jackson.core.JsonToken;
import org.apache.tomcat.util.digester.ArrayStack;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test3 {
    public static int solution(int[] A, int K) {

        ArrayList<Integer> evenList = new ArrayList<>();
        for(int i =0;i<A.length;i++){
              if(A[i]%2==0){
                  evenList.add(A[i]);
              }
        }

        Collections.sort(evenList);

        evenList.forEach(System.out::println);

        int sum = 0;
        for(int p = (evenList.size()-K);p<=evenList.size()-1;p++){
               sum += evenList.get(p);
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" solution "+solution(new int[]{4, 8, 9, 2, 6},3));

    }
}
