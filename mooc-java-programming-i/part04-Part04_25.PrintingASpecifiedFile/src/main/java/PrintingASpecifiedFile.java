
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Which file should have its contents printed?");
//        
//        String input = scanner.nextLine();
//        
//        if (input.equals("song.txt") ||input.equals("data.txt") ) {
//
//            // we read the file until all lines have been read
//            while (scanner.hasNextLine()) {
//                // we read one line
//                String row = scanner.nextLine();
//                // we print the line that we read
//                System.out.println(row);
//            }
//        } 

        ArrayList<String> lines = new ArrayList<>();

        // we create a scanner for reading the file
        try (Scanner scanner = new Scanner(Paths.get("song.txt"))) {

            // we read all the lines of the file
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(lines);

    }
}
