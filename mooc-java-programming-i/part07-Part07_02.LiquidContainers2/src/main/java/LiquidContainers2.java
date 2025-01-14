
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            

            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
   

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            if (input.contains(" ")) {
                String[] parts = input.split(" ");

                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
            
                
                if (input.equals("add " + amount)){
                    first.add(amount);

                }

                if (input.equals("move " + amount)){
                    if (first.contains() - amount < 0) {
                        second.add(first.contains());
                        first.remove(100);
                    } else {
                        second.add(amount);
                        first.remove(amount);
                    }
                }

                if (input.equals("remove " + amount)){
                    second.remove(amount);
                }
            }
        }
        
    }

}
