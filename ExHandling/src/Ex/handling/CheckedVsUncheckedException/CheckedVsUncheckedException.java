package Ex.handling.CheckedVsUncheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedVsUncheckedException {
    private static void readFile(String fileName){
        try (FileReader reader = new FileReader(fileName)) {
        } catch (FileNotFoundException fnfe) {
            System.out.println("the file doesn't exist");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        readFile("hello.txt");

    }
}
