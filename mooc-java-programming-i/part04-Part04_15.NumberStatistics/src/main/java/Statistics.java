
public class Statistics {
    private int count = 0;
    private int sum = 0;
    
    
    public Statistics() {
        // initialize the variable numberCount here
    }
    
    public void addNumber(int number) {
        sum += number;
        this.count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // write code here
        if (count != 0) {
            return (double)this.sum / (double)this.count;
        } else {
            return 0;
        }
    }    
}
