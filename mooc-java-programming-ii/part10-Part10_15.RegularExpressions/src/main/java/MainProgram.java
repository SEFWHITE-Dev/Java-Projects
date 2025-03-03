
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner s = new Scanner(System.in);
        
        Checker c = new Checker();
        
        System.out.println("Enter a string: ");
        
        String input = s.nextLine();
        
        if (c.isDayOfWeek(input)){
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
        if (c.allVowels(input)){
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
        if (c.timeOfDay(input)){
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
