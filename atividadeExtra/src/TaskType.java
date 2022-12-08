public enum TaskType {

    BATH("Banho"),
    GROOM("Tosa"),
    BATH_GROOM("Banho e Tosa");

    private final String name;

    TaskType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static TaskType fromString(String data) {
        for (TaskType val : values()) {
            if (val.toString().equals(data)) return val;
        }

        return null;
    }

}
