
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> archive = new ArrayList<>();
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String inputId = scanner.nextLine();
            if (inputId.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String inputName = scanner.nextLine();
            
            Item newItem = new Item(inputId, inputName);
            
            boolean exists = false;
            
            for (Item item: archive) {
                if (newItem.compareId(item)) {
                    exists = true;
                } else {
                    exists = false;
                }   
            }
            
            if (!exists) {
                archive.add(newItem);
            }
        }
        
        for (Item item: archive) {
            System.out.println(item.toString());
        }
    }
}
