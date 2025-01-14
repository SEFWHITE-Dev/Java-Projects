
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12, -1};
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
//        
int[] numbers = {8, 3, 7, 9, 1, 2, 4};
MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int temp = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= temp) {
                temp = array[i];
            }
        }
        
        return temp;
    }
    
    public static int indexOfSmallest(int[] array){
        int temp = array[0];
        int tempI = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= temp) {
                temp = array[i];
                tempI = i;
            }
        }
        
        return tempI;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int temp = array[startIndex];
        int from = startIndex;
        int tempI = 0;
        
        for (int i = from; i < array.length; i++) {
            if (array[i] <= temp) {
                temp = array[i];
                tempI = i;
            }
        }
        return tempI;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp1 = 0;
        int temp2 = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (i == index1) {
                temp1 = array[i];
            }
            if (i == index2) {
                temp2 = array[i];
            }
        }
        
        array[index1] = temp2;
        array[index2] = temp1;
    }
    
    public static void sort(int[] array) {
        // llop through, get the smallest bvalue, place it at 0
        // increment start point by 1, get the smallest value
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            
            swap(array, i, indexOfSmallestFrom(array, i));
            
            
            System.out.println(Arrays.toString(array));
        } 
    }
    
}
