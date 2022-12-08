public class Task {

    private final String name;
    private final TaskType type;
    private final double price;

    public Task(String name, TaskType type) {
        this.name = name;
        this.type = type;
        this.price = type == TaskType.BATH ? 20 : (type == TaskType.GROOM ? 25 : (20 + 25) * .75);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public TaskType getType() {
        return type;
    }

    @Override
    public String toString() {
        return getName() + "\t" + getType() + "\t" + getPrice();
    }

}
