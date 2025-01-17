
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double cost = 2.50;
        if (payment < cost) {
            
            return payment;
        } else {
            this.affordableMeals += 1;
            this.money += cost;
            return payment - cost;
        }        
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double cost = 4.30;
        if (payment < cost) {
            
            return payment;
        } else {
            this.heartyMeals += 1;
            this.money += cost;
            return payment - cost;
        } 
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double cost = 2.50;
        if (card.balance() < cost) {
            return false;
        } else {
           this.affordableMeals += 1;
           card.takeMoney(cost);
           return true;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double cost = 4.30;
        if (card.balance() < cost) {
            return false;
        } else {
           this.heartyMeals += 1;
           card.takeMoney(cost);
           return true;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        // ...
        if (sum <= 0) {
            return;
        }
        this.money += sum;
        card.addMoney(sum);
    }
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
