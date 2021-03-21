package interview.programs.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args)throws Exception {
       // System.out.println("t1 "+ DateTImeLocalDateTime.now().format("yyyy-MM-dd-HH-mm-ss-ns"));

       // Thread.sleep(5000L);
        System.out.println(
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss-ns").format(LocalDateTime.now()));

        System.out.println("t2 "+ LocalDateTime.now());

    }
}
