
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
               break;
            }
            list.add(input);
            
        }
//        ArrayList<Integer> positives = list.stream()
//                .filter(value -> value < 5 && value > 1)
//                .collect(Collectors.toCollection(ArrayList::new));
        
//        positives.stream()
//            .forEach(value -> System.out.println(value));
        list.stream()
               .filter(value -> value < 5 && value > 1)
                .forEach(System.out::println);
        
    }
}
