
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = 0;
        int secondNum = 0;
        
        System.out.println("Give the first number:");
        firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + (double)(((double)firstNum + (double)secondNum) / (double)2) );

    }
}
