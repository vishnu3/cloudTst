import java.io.*;

public class writeFile {



    public static void main(String[] args)throws Exception {
        whenWriteStringUsingBufferedWritter_thenCorrect();
    }

    public static  void whenWriteStringUsingBufferedWritter_thenCorrect()
            throws IOException {
        String str = "Hello";
        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(str);

        writer.close();
    }
}
