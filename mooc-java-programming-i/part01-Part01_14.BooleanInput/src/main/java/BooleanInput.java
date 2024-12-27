
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        // In Java any string with any variation of the type-case word "true" can be converted to boolean: true
        // any other statement returns false
        String booleanAsString = "TRue";
        boolean value = Boolean.valueOf(booleanAsString);
        System.out.println(value);
        
        String falseAsString = "false";
        boolean value2 = Boolean.valueOf(falseAsString);
        System.out.println(value2);

        String falseAsString2 = "False";
        boolean value3 = Boolean.valueOf(falseAsString2);
        System.out.println(value3);
    }
}
