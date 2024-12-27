
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputDays = 0;
        int totalSeconds = 0;
        
        System.out.println("How many days would you like to convert to seconds?");
        inputDays = Integer.valueOf(scanner.nextLine());
        totalSeconds = inputDays * (60 * 60 * 24);
        System.out.println(totalSeconds);

    }
}
