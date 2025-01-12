
public class Money {

    private final int euros; // final means they are IMMUTABLE, cant be changed once set
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        int newE = this.euros + addition.euros;
        int newC = this.cents + addition.cents;
        
        Money newMoney = new Money(newE, newC);

        // return the new Money object
        return newMoney;
    }
    public boolean lessThan(Money compared) {
//        boolean value = true;
//        if (compared.euros <= this.euros) {
//            if (compared.cents <= this.cents) {
//                value = true;
//            }
//            value = true;
//        } else {
//            value = false;
//        }
//        
//        return value;
        if (this.euros < compared.euros) {
            return true;
        } 
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int newE = this.euros - decreaser.euros;
        int newC = this.cents - decreaser.cents;
        
        if (newC < 0) {
            newC += 100;
            newE -= 1;
        }
                
        if (newE < 0) {
            newE = 0;
            newC = 0;
        }
        
        Money newMoney = new Money(newE, newC);

        // return the new Money object
        return newMoney;
    }

}
