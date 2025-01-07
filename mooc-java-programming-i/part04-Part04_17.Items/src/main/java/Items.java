
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = ""; 
        
        while (true) {
            System.out.println("Name: ");
            input = scanner.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            
           // Item newItem = new Item(input);
            
            items.add(new Item(input));
        }
        
        for (Item item: items) {
            System.out.println(item);
        }
    }
}
