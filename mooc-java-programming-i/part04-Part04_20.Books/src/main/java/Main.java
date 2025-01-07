import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in); 
        
        String name;
        int pages;
        int pubYear;
        
        ArrayList<Book> books = new ArrayList<>();
        boolean stop = false;
        while (stop == false) {
            System.out.println("Title: ");
            name = scan.nextLine();
            
            if(name.isEmpty()) {
                stop = true;
                break;
            }
            
            System.out.println("Pages: ");
            pages = Integer.valueOf(scan.nextLine());
            
            System.out.println("Publication year: ");
            pubYear = Integer.valueOf(scan.nextLine());
            
            books.add(new Book(name, pages, pubYear));
            
        }
        
        System.out.println("What information will be printed? ");
        String input = scan.nextLine();
        
        
        
        if(input.equals("everything")){
            for (Book book: books) {
                System.out.println(book.toString());
            }
        } else if(input.equals("name")) {
//            for (Book book: books) {
//                if(book.getTitle().equals(name)) {
//                    System.out.println(book.toString());
//                }
//            }
            for (Book book: books) {
                System.out.println(book.getTitle());
            }
        }

    }

}

