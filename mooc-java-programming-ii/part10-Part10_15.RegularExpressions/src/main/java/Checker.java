

public class Checker {
    
    public boolean isDayOfWeek(String string) {
        if (string.matches("(mon|tue|wed|thu|fri|sat|sun)")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean allVowels(String string) {
        return string.matches("[aeiouAEIOU]+");
    }
    
    public boolean timeOfDay(String string) {
        return string.matches("([01]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)");
    }
    
}
