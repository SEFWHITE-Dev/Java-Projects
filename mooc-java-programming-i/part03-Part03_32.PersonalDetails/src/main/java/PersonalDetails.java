
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int temp = 0;
        String name = "";
        double sum = 0;
        int length = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            
            for (int i = 0; i < parts.length; i++) {
                if (temp < String.valueOf(parts[0]).length()){
                    temp = String.valueOf(parts[0]).length();
                    name = String.valueOf(parts[0]);
                }
                
            }
            //System.out.println(sum + length);
            sum += Double.valueOf(parts[1]);
            length++;
        }
        
        sum = sum / length;
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + sum);

    }
}
