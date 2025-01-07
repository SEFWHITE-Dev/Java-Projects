
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            
            for (int i = 0; i < parts.length; i++) {
                if (temp < Integer.valueOf(parts[1])){
                    temp = Integer.valueOf(parts[1]);
                    name = String.valueOf(parts[0]);
                }
            }
            
        }
        System.out.println("Name of the oldest: " + name);
    }
}
