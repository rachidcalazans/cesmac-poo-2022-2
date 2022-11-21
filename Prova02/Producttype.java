public enum ProductType {

    GOIABA("Goiaba"),
    MORANGO("Morango"),
    MACA_VERDE("Maçã Verde"),
    NESCAU_COM_NUTELLA("Nescau com Nutella"),
    MENTA("Menta");

    private final String displayName;

    ProductType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static ProductType getByName(String name) {
        for (ProductType type : values()) {
            if (type.getDisplayName().equalsIgnoreCase(name)) return type;
        }

        return null;
    }

}