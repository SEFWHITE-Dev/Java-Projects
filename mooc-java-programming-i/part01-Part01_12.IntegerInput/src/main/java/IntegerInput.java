
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String valueAsString = "35";
        int value = Integer.valueOf(valueAsString);
        System.out.println(value);
        
        System.out.println("Give a number: ");
        int inputValue = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + inputValue);
        
        

    }
}
