
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int end = 100;
        
        for (int i = num; i <= end; i++) {
            
            System.out.println(i);
        }
        
        
    }
}
