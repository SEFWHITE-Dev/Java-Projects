
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Give numbers:");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (input % 2 == 0) {
                even++;
            }
            else if (input % 3 == 0) {
                odd++;
            }

            count++;
            total += input;
        }
        System.out.println("Sum:" + total);
        System.out.println("Numbers:" + count);

        System.out.println("Average:" + (double)total / count );
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
        

    }
}
