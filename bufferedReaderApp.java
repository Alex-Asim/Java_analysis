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
            // Append the current line to the StringBuilder object
            stringBuilder.append(line);
            // Append a line separator after each line
            stringBuilder.append(System.lineSeparator());
        }

        // Print contents of the StringBuilder
        System.out.println(stringBuilder.toString());

        } catch (IOException e){
            // Print the stack trace if an exception occurs during file reading
            e.printStackTrace();
        }
    
    }
}

// Explanation:

// This source code is a Java program that reads a text file using BufferedReader and prints its contents to the console.
// The program starts by declaring a constant variable HAMLET_PART_FILE_PATH which is the file path of the text file to be read.
// Next, it opens a try block and creates a FileReader object named hamletReader by passing the file path to its constructor. The try block also includes the declaration and initialization of
// a BufferedReader object named hamletBufferReader which is initialized with the hamletReader object. Additionally, a StringBuilder object named stringBuilder is created.
// Then, the program calls the skip method on the hamletBufferReader to skip the specified number of characters (in this case 14 characters). This skips the first 14 characters in the file.
// After that, a while loop is used to read each line from the hamletBufferReader using the readLine method. The loop continues until it reaches the end of the file (the readLine method returns null).
// Inside the loop, each line is appended to the stringBuilder object using the append method, and the platform-specific line separator (System.lineSeparator()) is also appended to maintain the original 
// line breaks. Finally, the program converts the contents of the stringBuilder object to a string using the toString method, and then prints the resulting string to the console using System.out.println.
// The code is wrapped in a catch block to handle any IOException that may occur during the file reading process. If an exception occurs, the stack trace is printed using the printStackTrace method.

