
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // type cast int into a double
        int first = 3;
        int second = 2;

        double result1 = (double) first / second;
        System.out.println(result1); // prints 1.5

        double result2 = first / (double) second;
        System.out.println(result2); // prints 1.5

        double result3 = (double) (first / second);
        System.out.println(result3); // prints 1.0

    }
}
