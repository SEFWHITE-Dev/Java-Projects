
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter point totals, -1 stops:");

        
        while (true) {
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            
            }
            
            if ((input > 100 || input <= 0 || input == -1)) {
                System.out.println("not added");
                continue;
            }
            list.add(input);
            System.out.println("added: " + input);
            
        }
        
        if (list.size() != 0) {
            double avg = 0;
            for (Integer item: list) {
                avg += item;
            }
            avg = avg / list.size();

            double avgPass = 0.0;
            int count = 0;
            for (Integer item: list) {
                if (item >= 50) {
                    avgPass += item;
                    count++;
                    System.out.println("addeds");
                }
            }
            
            double passPercent = 0.0;
  
            if (count != 0) {
                avgPass = (double)avgPass / (double)count;

                passPercent = 100 * (double)count / (double)list.size();

                System.out.println("coutn: " + count + "    list isze: " + list.size());
            }
                


            System.out.println("Point average (all): " + (double)avg);
            if (avgPass >= 50) {
                System.out.println("Point average (passing): " + (double)avgPass);
            } else {
                System.out.println("Point average (passing): -");
            }
            System.out.println("Pass percentage: " + (double)passPercent);
            
        }
        
        
    }
}
