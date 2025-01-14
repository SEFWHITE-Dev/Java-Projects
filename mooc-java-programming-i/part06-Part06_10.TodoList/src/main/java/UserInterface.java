
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
    private TodoList list;
    private Scanner s = new Scanner(System.in);
    
    public UserInterface(TodoList list, Scanner s) {
        this.list = list;
        this.s = s;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Command: ");
            String input = this.s.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            else if (input.equals("add")) {
                System.out.println("To add: ");
                String item = this.s.nextLine();
                this.list.add(item);
            }
            
            else if (input.equals("list")) {
                this.list.print();
            }
            
            else if (input.equals("remove")) {
                System.out.println("Which one is removed? ");
                String item = this.s.nextLine();
                this.list.remove(Integer.valueOf(item));
            }
            
        }
    }
}
