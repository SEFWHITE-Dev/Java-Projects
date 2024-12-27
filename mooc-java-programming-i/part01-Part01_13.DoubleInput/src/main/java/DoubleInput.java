
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringAsValue = "234.345";
        double value = Double.valueOf(stringAsValue);
        System.out.println(value);

    }
}
