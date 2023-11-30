import java.io.File;
import java.io.IOException;

public class file_handling {

    public static void main(String[] args) {
        // To use the same path every time we type the next line in order to avoid type the whole path every time
        String FILE_HANDLING_DIRECTORY = "...\\Examples_Revision\\";
        
        // Initiate the file
        File famousQuotesFile = new File(FILE_HANDLING_DIRECTORY + "famousQuotes.txt");

        // Use try and catch to avoid possible mistakes when you create the file
        try{
            if (famousQuotesFile.createNewFile()) {
                System.out.println("The file is created.");
            }
        } catch (IOException exception){
            exception.printStackTrace();;
        }


        // Initiate the second file name you want to transform the existance file
        File famousPersonQuotesFile = new File(FILE_HANDLING_DIRECTORY + "famousPersonQuotes.txt");
        if (famousQuotesFile.renameTo(famousPersonQuotesFile)){
            System.out.println("The file is renamed");
        }

        // Delete the existance file
         if (famousQuotesFile.delete()){
            System.out.println("The file is deleted");
        }
    }
}
