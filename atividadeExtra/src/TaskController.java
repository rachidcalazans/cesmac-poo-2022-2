import java.text.DecimalFormat;
import java.util.LinkedList;

public final class TaskController {

    private static final TaskController instance = new TaskController();

    public static TaskController getInstance() {
        return instance;
    }

    private final LinkedList<Task> tasks;
    private final TaskPojo taskPojo;

    private TaskController() {
        this.taskPojo = new TaskPojo();
        this.tasks = new LinkedList<>(taskPojo.loadFromFile());
    }

    public LinkedList<Task> getTasks() {
        return tasks;
    }

    public void add(Task task) {
        this.tasks.add(task);
        taskPojo.write(task);
    }

    public double getTotalMoney() {
        double total = 0;

        for (Task task : tasks) {
            total += task.getPrice();
        }

        return total;
    }


}
