package codility.ibkr;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test {
    public static int solution(int[] A) {
        

        return Integer.compare(
                IntStream.of(A).reduce((a,b)->a*b).getAsInt()
                , 0);




    }

    public static void main(String[] args) {
        int solution = solution(new int[]{1, -2, 3, 5});

        System.out.println(solution);
    }
}
