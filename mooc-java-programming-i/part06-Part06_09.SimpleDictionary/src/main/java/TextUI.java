
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
public class TextUI {
    
    private Scanner scanner = new Scanner(System.in);
    private SimpleDictionary simpleDic;
    
    
    public TextUI(Scanner scanner, SimpleDictionary dic){
        this.scanner = scanner;
        this.simpleDic = dic;
    }
    
    public void start() {

        
        while(true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            else if (input.equals("add")) {
                System.out.println("Word: ");
                String inputWord = scanner.nextLine();
                
                System.out.println("Translation: ");
                String inputTrans = scanner.nextLine();
                
                this.simpleDic.add(inputWord, inputTrans);
            }
            
            else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String inputWord = scanner.nextLine();
                
                //if (this.simpleDic.equals(inputWord)) {
                if (simpleDic.translate(inputWord) == null) {
                    System.out.println("Word " +inputWord +" was not found");
                } else {
                    //if (simpleDic.toString().contains(inputWord)) {
                    System.out.println(simpleDic.translate(inputWord));
                    //}
                }
                
            }
            
            else {
                System.out.println("Unknown command");
            }
            
        }
    }
    
}
