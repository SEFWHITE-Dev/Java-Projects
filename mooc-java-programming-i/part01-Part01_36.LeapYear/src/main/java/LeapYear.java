
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = Integer.valueOf(scan.nextLine());
        System.out.println("Give a year:"+year);
        
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("The year is a leap year.");
        }
        else if (year % 4 == 0) {
            System.out.println("The year is a leap year.");           
        }
        else if (year % 100 == 0) {
            System.out.println("The year is a not leap year.");           
        }
        else {
             System.out.println("The year not is a leap year.");
        }
    }
}
