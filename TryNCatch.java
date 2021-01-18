import java.util.Scanner;
import java.io.File;

public class TryNCatch {
    public static void main(String args[]) {


        try {
            //creating File instance to reference text file in Java
            File inputfile = new File("C:\\Users\\path"); // Mention the path to the file here

            Scanner scan = new Scanner(inputfile);

            while (scan.hasNextLine() == true) {

                String line = scan.nextLine();
                System.out.println(line);
            }

            scan.close();

        } catch (Exception e) {
            System.out.print("File not found");
        }
    }
}
