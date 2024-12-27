
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        
        System.out.println("Give the first number:");
        firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        thirdNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + (((double)firstNum + (double)secondNum + (double)thirdNum) / (double)3) );

    }
}
