
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
int[] numbers = {8, -2, 3, 1, 1, 1, 2, 3};
System.out.println(sum(numbers, 5, numbers.length, 0, 999));

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        int start = 0;
        int end = 0;
        
        if (fromWhere < 0) {
            start = 0;
        }
        
        if (toWhere >= array.length) {
            end = array.length - 1;
            
        }
        
        
        for (int i = start; i <= end; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                sum += array[i];
            }
        }
        
        return sum;
    }
}
