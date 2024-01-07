
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList();

    }

    public ArrayList exerciseList() {
        return (ArrayList) this.exercises.clone();
    }

    public void add(String e) {
        this.exercises.add(new Exercise(e));
    }

    public void markAsCompleted(String e) {
        for (Exercise ex : this.exercises) {
            if (ex.getName().equals(e)) {
                ex.setCompleted(true);
                break;
            }
        }
    }

    public boolean isCompleted(String e) {
        for (Exercise ex : this.exercises) {
            if (ex.getName().equals(e)) {
                return ex.isCompleted();
                
            }
        }
        return false;
    }

}
