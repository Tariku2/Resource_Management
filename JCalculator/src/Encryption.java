import javax.xml.transform.Result;
import java.io.*;

public class Encryption {



        /*
         * Complete the 'decryptMessage' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING encryptedMessage as parameter.
         */
    

        public static String decryptMessage(String encryptedMessage) {

            return encryptedMessage;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String encryptedMessage = bufferedReader.readLine();

           
            String result = Result.decryptMessage(encryptedMessage);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
