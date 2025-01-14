
import java.util.ArrayList;


public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        
        for (Exercise e: exercises){
            list.add(e.getName());
        }
        
        return list;
    }
    
    public void add(String input) {
        this.exercises.add(new Exercise(input));
    }
    
    public void markAsCompleted(String input) {
        for (Exercise e: exercises){
            if(e.getName().equals(input)){
                e.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String input) {
        for (Exercise e: exercises){
            if(e.getName().equals(input)){
                return e.isCompleted();
            }
        }
        return false;
    }
}
