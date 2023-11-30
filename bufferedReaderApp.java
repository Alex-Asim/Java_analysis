import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReaderApp {
    public static void main(String[] args) {
    
        String HAMLET_PART_FILE_PATH = "...\\Ebooks\\Business.txt";

        try (FileReader hamletReader = new FileReader(HAMLET_PART_FILE_PATH)){
           
        BufferedReader hamletBufferReader = new BufferedReader(hamletReader);
           
        StringBuilder stringBuilder = new StringBuilder();

        String line;
           
        // The following command skip the number of the characters you give insinde the parenthesis  
        hamletBufferReader.skip(14);

        while ((line = hamletBufferReader.readLine()) != null) {
        stringBuilder.append(line);
        stringBuilder.append(System.lineSeparator());
        }
        System.out.println(stringBuilder.toString());

        } catch (IOException e){
            e.printStackTrace();
        }
    
    }
}
