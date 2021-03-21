import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        HashMap<String,String> x =  new HashMap<>();
        HashMap<Long,Long> a = new HashMap<>();



        x.put("Q","p");
        x.put("Q","l");
        a.put(1L,2L);
        a.put(1L,9L);


        //x.forEach((x,y)-> System.out.println(x+""y));

        System.out.println(x);

        System.out.println(a);

    }
}
