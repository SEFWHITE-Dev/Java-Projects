import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;


public class ExerciseManagementTest {
    
    private ExerciseManagement m;
    
    @Before
    public void initialize() {
        m = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, m.exerciseList().size());
    }

    
    @Test
    public void addingExerciseGrowsListByOne() {
        m.add("Write a test");
        assertEquals(1, m.exerciseList().size());
    }
    
    @Test
    public void addingExerciseIsInList() {
        m.add("Write a test");
        assertTrue(m.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        m.add("New exercise");
        m.markAsCompleted("New exercise");
        assertTrue(m.isCompleted("New exercise")); 
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        m.add("New exercise");
        m.markAsCompleted("New exercise");
        assertFalse(m.isCompleted("Some exercise")); 
    }
}
