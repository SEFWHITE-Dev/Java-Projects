
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int inputNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int inputNum2 = Integer.valueOf(scanner.nextLine());
        
        for (int i = inputNum2; i <= inputNum; i++) {
            if (inputNum < inputNum2) {
                System.out.println("");
            }  
            System.out.println(i);
        }
        
    }
}
