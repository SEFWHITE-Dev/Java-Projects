
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String inputMeal){
        boolean exists = false;
        
        for (String meal: meals) {
            if (inputMeal.equals(meal)){
                exists = true;
            } else{
                exists = false;
            }
        }
        
        if(!exists) {
            meals.add(inputMeal);
        }
    }
        
    public void printMeals() {
        for (String meal: meals) {
            System.out.println(meal);
        }
        

    }
                
    public void clearMenu(){
        meals.clear();
    }
}
