import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskPojo {

    private final List<Task> tasks;
    private final File file;

    public TaskPojo() {
        this.tasks = new ArrayList<>();
        this.file = createEmpty();
    }

    private File createEmpty() {
        final String dir = System.getProperty("user.dir");
        final File file = new File(dir, "tasks.txt");

        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return file;
    }

    public List<Task> loadFromFile() {
        final Scanner fileScanner;

        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (fileScanner.hasNext()) {
            final String[] data = fileScanner.nextLine().split("\t");

            tasks.add(new Task(data[0], TaskType.fromString(data[1])));
        }

        return tasks;
    }

    public void write(Task task) {
        final Path path = file.toPath();

        try {
            final String content = Files.readString(path);

            Files.writeString(path, (content.length() > 0 ? content + "\n" : "") + task.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
