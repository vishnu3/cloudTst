package interview.programs.ms;

public class test2 {
    public static void main(String[] args) {
        class Exc0 extends Exception{};
        class Exc1 extends Exc0{};
        try{
            throw  new Exc1();

        }catch (Exc0 eo){
            System.out.println("eo coutht");

        }catch (Exception e){
            System.out.println("Exception causght");
        }
    }
}
