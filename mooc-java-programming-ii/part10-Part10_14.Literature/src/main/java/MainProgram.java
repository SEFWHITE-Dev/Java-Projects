
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram implements Comparator<Book>{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> books = new ArrayList<>();
        
        
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            Book newBook = new Book();
            newBook.setName(input);
            
            System.out.println("Input the age recommendation: ");
            input = scanner.nextLine();
            newBook.setAge(Integer.valueOf(input));
            
            books.add(newBook);
        }
        
        System.out.println(books.size() + " books in total.");
        
        Comparator<Book> comp = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comp);
        
        for (Book b : books) {
            System.out.println(b.getName() + " (recommended for " + b.getAge() +" year-olds or older)");
        }
        
        
    }

    @Override
    public int compare(Book arg0, Book arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
