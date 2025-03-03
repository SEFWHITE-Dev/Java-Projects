
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        map.add("cat", "meow");
        map.add("dog", "bark");
        map.add("cow", "moo");

        System.out.println(map.get("dog"));  // Output: bark
        System.out.println(map.get("cat"));  // Output: meow
        System.out.println(map.get("cow"));  // Output: moo
        System.out.println(map.get("lion")); // Output: null

        map.remove("dog");
        System.out.println(map.get("dog"));  // Output: null
        List<String> myList = new ArrayList<>();


}}
