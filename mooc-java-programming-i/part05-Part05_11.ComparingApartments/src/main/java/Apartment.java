
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        int p1 = this.princePerSquare * this.squares;
        int p2 = compared.princePerSquare * compared.squares;
        if (p2 < p1) {
          return p1 - p2;  
        } else {
            return p2 - p1;    
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int p1 = this.princePerSquare * this.squares;
        int p2 = compared.princePerSquare * compared.squares;
        if (p2 < p1) {
          return true;  
        } else {
            return false;    
        }
    }

}
