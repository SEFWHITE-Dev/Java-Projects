
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            if (input.isEmpty()) {
                break;
            }
            
            input = scanner.nextLine();
            list.add(input);
        }
        //System.out.println(list);
        list.stream()
                .forEach(value -> System.out.println(value));
    }
}
