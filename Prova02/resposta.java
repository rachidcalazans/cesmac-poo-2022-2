public final class Main {

    public static void main(String[] args) {
        final ProductController controller = ProductController.getInstance();

        sell(controller);
        printInventory(controller);

        System.out.format(
                "Total de vendas hoje: R$ %s",
                new DecimalFormat("#,###.###").format(controller.getSoldTotal())
        ).println();
    }

    private static void sell(ProductController controller) {
        // Maria
        controller.sell(ProductType.GOIABA, 2);
        controller.sell(ProductType.NESCAU-COM-NUTELLA, 3);
        controller.sell(ProductType.MENTA, 1);

        // João
        controller.sell(ProductType.MORANGO, 3);
        controller.sell(ProductType.MACA-VERDE, 5);

        // Pedro
        controller.sell(ProductType.MENTA, 2);
        controller.sell(ProductType.MACA-VERDE, 2);
    }

    private static void printInventory(ProductController controller) {
        for (Map.Entry<ProductType, Product> entry : controller.getInventory().entrySet()) {
            final String name = entry.getKey().getDisplayName();
            final int amount = entry.getValue().getAmount();

            System.out.format(
                    "Há %s flau(s) do sabor %s disponíveis em estoque;",
                    amount, name
            ).println();
        }
    }

}

public class Product {

    private final int id;
    private final double price;
    private int amount;

    public Product(int id, double price, int amount) {
        this.id = id;
        this.price = price;
        this.amount = amount;
    }

    public Product(int id, double price) {
        this(id, price, 10);
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void sell() {
        if (amount == 0) throw new UnsupportedOperationException("Can't sell without the item in inventory.");

        setAmount(getAmount() - 1);
    }

}

import java.util.HashMap;
        import java.util.Map;

public final class ProductController {

    private static final ProductController INSTANCE = new ProductController();

    private final Map<ProductType, Product> inventory;

    private ProductController() {
        this.inventory = new HashMap<>() {{
            put(ProductType.GOIABA, new Product(1, .5));
            put(ProductType.MORANGO, new Product(2, .75));
            put(ProductType.MACA-VERDE, new Product(3, .75));
            put(ProductType.NESCAU-COM-NUTELLA, new Product(4, 1));
            put(ProductType.MENTA, new Product(5, .5));
        }};
    }

    public Map<ProductType, Product> getInventory() {
        return inventory;
    }

    public boolean isAvailable(ProductType type) {
        return getInventory().get(type).getAmount() > 0;
    }

    public void sell(ProductType type) {
        try {
            getInventory().get(type).sell();
        } catch (UnsupportedOperationException exception) {
            System.out.format(
                    "O estoque de %s acabou.",
                    type.getDisplayName()
            ).println();
        }
    }

    public void sell(ProductType type, int amount) {
        for (int times = 0; times < amount; times++) sell(type);
    }

    public double getSoldTotal() {
        double total = 0;

        for (Product product : getInventory().values()) {
            final int timesSold = 10 - product.getAmount();

            total += timesSold * product.getPrice();
        }

        return total;
    }

    public static ProductController getInstance() {
        return INSTANCE;
    }

}

public enum ProductType {

    GOIABA("Goiaba"),
    MORANGO("Morango"),
    MACA-VERDE("Maçã Verde"),
    NESCAU-COM-NUTELLA("Nescau com Nutella"),
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

        return null;
    }

}