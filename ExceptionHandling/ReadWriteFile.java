package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWriteFile {

    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }

    void saveFile() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
    }
}

class Test {
    public static void main(String[] args) {
        ReadWriteFile rw = new ReadWriteFile();
        try {
            rw.readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

}
