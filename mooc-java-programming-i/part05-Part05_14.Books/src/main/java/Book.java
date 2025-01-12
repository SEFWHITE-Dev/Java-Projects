
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean checkDupe(Book input) {
        
        if(this == input) {
            return true;
        }
        
        if (this.name.equals(input.name) && this.publicationYear == input.publicationYear){
            return true;
        } else {
            return false;
        }
    }
}
