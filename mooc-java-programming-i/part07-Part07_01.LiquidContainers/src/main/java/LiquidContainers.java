
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
   

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            if (input.contains(" ")) {
                String[] parts = input.split(" ");

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
            
                
                if (input.equals("add " + amount)){
                    if (amount > 0) {
                        first += amount;
                        if (first >= 100) {
                            first = 100;
                        }
                    }

                }

                if (input.equals("move " + amount)){
                    if (first - amount < 0) {
                        second += first;
                        first = 0;
                    } else {
                        second += amount;
                        first -= amount;
                    }

                    if (second >= 100) {
                        second = 100;
                    }
                }

                if (input.equals("remove " + amount)){
                    second -= amount;
                    if (second < 0) {
                        second = 0;
                    }
                }
            }
        }
        
        
    }

}
