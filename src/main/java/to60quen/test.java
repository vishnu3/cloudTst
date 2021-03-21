package to60quen;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class test {
    Optional<String> bookname;
    public test(Optional<String> bookname){
        this.bookname = bookname;
    }
    public Optional<String> getBookname(){
        return bookname;
    }

    public static void main(String[] args) {
        test nullbook = new test(Optional.ofNullable(null));
        Optional<String> name = nullbook.getBookname();


         name.ifPresent(System.out::println);
    }

}
