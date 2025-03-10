
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class UserInterface {
    private JokeManager jm;
    private Scanner s = new Scanner(System.in);
    
    public UserInterface(JokeManager jm, Scanner s) {
        this.jm = jm;
        this.s = s;
    }
    
    public void start(){
        while (true) {
            
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String input = s.nextLine();
            if (input.equals("X")){
                break;
            }
            
            else if (input.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = s.nextLine();
                this.jm.addJoke(joke);
            }
            else if (input.equals("2")){
                this.jm.drawJoke();
            }
            else if (input.equals("3")){
                this.jm.printJokes();
            }
        }
    }
    
}
