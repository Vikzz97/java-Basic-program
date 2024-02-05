package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyBlockExample {
    public static void main(String[] args) throws IOException {
        FileInputStream f = null;
        FileInputStream d = null;
        try {
            f = new FileInputStream("d:/abc.txt");
            d = new FileInputStream("d:/abc.txt");
        } catch (ArithmeticException e) {
            System.out.println(f);

        } catch (Exception e) {
            System.out.println(d);

        }
    }

    // finally{
    // // cleanup heare
    // if (f!=null) {
    // f.close();
    // }
    // System.out.println("file closed9.");
    // }
}
