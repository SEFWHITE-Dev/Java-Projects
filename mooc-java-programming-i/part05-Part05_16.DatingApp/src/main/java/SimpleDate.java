
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        this.day++;
        while (this.day > 30) {
            this.day -= 30;
            this.month++;
            if(this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }
    
    public void advance(int howManyDays){
//        this.day += howManyDays;
//        if (this.day >= 30) {
//            this.month += 1;
//            this.day =30 - howManyDays;
//        }
//        if (this.month >= 12) {
//            this.year += 1;
//            this.month = 1;
//        }
        this.day += howManyDays;
        while (this.day > 30) {
            this.day -= 30;
            this.month++;
            if(this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        int newDay = this.day + days;
        int newMonth = this.month;
        int newYear = this.year;
        
//        if (newDay >= 30) {
//            newMonth += 1;
//            newDay = 30 - newDay;
//            
//        }
//        if (newMonth >= 12) {
//            newYear += 1;
//            newMonth = 1;
//        }
        while (newDay > 30) {
            newDay -= 30;
            newMonth++;
            if(newMonth > 12) {
                newMonth = 1;
                newYear++;
            }
        }
        
        SimpleDate newDate = new SimpleDate(newDay, newMonth, newYear);
        
        return newDate;
    }

}
