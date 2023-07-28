package EOF;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GFG {
    public static void main(String[] args) throws IOException {

        // Read the stream 'demo.txt'
        // containing text
        // "GEEKSFORGEEKS"
        // "geeksforgeeks"
        FileReader fileReader
                = new FileReader(
                "C:/Users/lenovo/OneDrive/Desktop/hello.txt");

        // Convert fileReader to
        // bufferedReader
        BufferedReader buffReader
                = new BufferedReader(
                fileReader);

        while (buffReader.ready()) {
            System.out.println(
                    buffReader.readLine());
        }
    }
}