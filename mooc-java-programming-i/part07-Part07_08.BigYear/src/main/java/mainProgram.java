
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        ArrayList<Bird> list = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        
        
        while (true) {
            System.out.println("?");
            String input = scan.nextLine();
            
            if (input.equals("Quit")) {
                break;
            }
            
            if (input.equals("Add")) {
                System.out.println("Name: ");
                input = scan.nextLine();
                
                for (Bird bird: list) {
                    if(bird.getName().equals(input)) {
                        continue;
                    }
                }
                
                Bird bird = new Bird();
                bird.setName(input);
                
                System.out.println("Name in Latin: ");
                input = scan.nextLine();
                bird.setNameLatin(input);
                bird.setSeenCount(0);
                
                list.add(bird);
            }
            
            if (input.equals("Observation")) {
                System.out.println("Bird?");
                input = scan.nextLine();
                
                boolean isBird = false;
                
                for (Bird bird: list) {
                    if (bird.getName().equals(input)){
                        bird.setSeenCount(bird.getSeenCount() + 1);
                        isBird = true;
                    }
                }
                if (!isBird) {
                    System.out.println("Not a bird!");
                }
            }
            
            if (input.equals("All")) {
                for (Bird bird: list) {
                    System.out.println(bird.toString());
                }
            }
            
            if (input.equals("One")) {
                System.out.println("Bird? ");
                input = scan.nextLine();
                
                for (Bird bird: list) {
                    if (bird.getName().equals(input)){
                        System.out.println(bird.toString());
                    }
                }
            }
            
            
        }
    }

}
