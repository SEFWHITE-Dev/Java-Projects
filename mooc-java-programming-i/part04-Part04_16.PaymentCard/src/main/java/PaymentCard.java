/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class PaymentCard {
    private double balance = 0;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " +balance+ " euros";
    }
    
    public void eatAffordably() {
        double temp = this.balance - 2.60;
        if (temp <= 0.0) {
            return;
        } else {
            this.balance -= 2.60;
        }   
    }

    public void eatHeartily() {
         
        double temp = this.balance - 4.60;
        if (temp <= 0.0) {
            return;
        } else {
            this.balance -= 4.60;
        } 
    }
    
    public void addMoney(double amount) {
        if (amount <= 0) {
            return;
        }
        
        this.balance += amount;
        if (this.balance > 150.0) {
            this.balance = 150.0;
        }
    }
}
