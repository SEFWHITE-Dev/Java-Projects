
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String input2 = "";
        String input3 = "";
        
        while (true) {
            System.out.println("First name: ");
            input = scanner.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            input2 = scanner.nextLine();
            
            System.out.println("Identification number: ");
            input3 = scanner.nextLine();
            
            PersonalInformation newInfo = new PersonalInformation(input, input2, input3);
                    
            infoCollection.add(newInfo);
        }
        
        for(PersonalInformation info: infoCollection){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
