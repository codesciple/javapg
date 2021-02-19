
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScanText {
    public static void main(String args[]) throws FileNotFoundException {

        //creating File instance to reference text file in Java
        File inputfile = new File("C:\\Users\\path"); // specify the path of the file

        Scanner scan = new Scanner(inputfile);

        //Reading each line of file using Scanner class
        int lineNumber = 1;  // keep track of line number

        while(scan.hasNextLine()==true){

            String line = scan.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }
    }
}
