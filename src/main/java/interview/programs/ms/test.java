package interview.programs.ms;

public class test {
    public static void main(String[] args) {
        try{
            badMethod();
            System.out.println("A");

        }catch (Exception ex){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
    }

    public static void badMethod() {
        throw new Error();

    }
}
