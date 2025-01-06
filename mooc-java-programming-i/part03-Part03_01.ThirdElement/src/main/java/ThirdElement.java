
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println(list.get(2));
//        Scanner x = new Scanner(System.in);
//        System.out.print("Customer number: ");
//        int y = Integer.valueOf(x.nextLine());
//
//        if (y >= 1000 && y % 25 == 0) {
//            System.out.println("Gets a gift card!");
//        } else if (y % 2000 == 0) {
//            System.out.println("Gets a large gift card!");
//        } else {
//            System.out.println("Gets nothing.");
//        }
    }
}
