
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        boolean found = false;
        
        try (Scanner scanner2 = new Scanner(Paths.get("file.txt"))) {
            
            while (!file.isEmpty()) {
                if (file.contains(searchedFor)) {
                    found = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Print result based on search outcome
        if (found) {
            System.out.println("Found!");
        } else {
                System.out.println("Not found.");
        }

    }
}
