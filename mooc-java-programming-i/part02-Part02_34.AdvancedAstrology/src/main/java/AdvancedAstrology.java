
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");            
            i++;
        }
        System.out.println("");

    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print(" ");            
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 0; i < size; i++) {                        
//            for (int j = 0; j < size - i; j++) {
//                printSpaces(size-i);    
//                printStars(j);
//            }
            printSpaces(size - i);    
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 0; i <= height; i++) {       
            for (int j = height; j > height; j--) {
                printSpaces(j);    
                
            }
            printSpaces(height - i);    
            printStars(i * 2 -1);
        }
        
        int spaces = height - 2;
        
//        for (int t = 0; t < spaces; t++) {
//            printSpaces()
//        }
        
        printSpaces(spaces);
        printStars(3);
        printSpaces(spaces);
        printStars(3);
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                //printStars(1);   
//                //System.out.println("");
//                System.out.print("*");
//            }   
//            //printStars(1); 
//            System.out.println("");
//        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
