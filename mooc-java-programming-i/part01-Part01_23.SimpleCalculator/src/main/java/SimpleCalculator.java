
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstNum = 0;
        int secondNum = 0;
        
        System.out.println("Give the first number:");
        firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println(firstNum +" + "+ secondNum +" = "+ (firstNum + secondNum));
        System.out.println(firstNum +" - "+ secondNum +" = "+ (firstNum - secondNum));
        System.out.println(firstNum +" * "+ secondNum +" = "+ (firstNum * secondNum));
        System.out.println(firstNum +" / "+ secondNum +" = "+ ((double)firstNum / (double)secondNum));
                
        
    }
}
