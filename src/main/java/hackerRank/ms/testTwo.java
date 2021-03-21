package hackerRank.ms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class   test0 extends Exception{}
class   test2 extends test0 {}

public class testTwo implements Runnable{
    private String name;

    public testTwo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        msg(1);msg(2);
    }

    public  synchronized void msg(int n){
        System.out.print(name+" "+n+" ");
    }

    public static void main(String[] args)throws Exception {
         Set<Integer> s =  new HashSet<>();
         s.addAll(Arrays.asList(5,3,4,9,7,6,1));

         s = new TreeSet<>(s);

        System.out.println(s);


    }
}
