import java.util.HashMap;
import java.util.Map;

public final class ProductController {

    private static final ProductController INSTANCE = new ProductController();

    private final Map<ProductType, Product> inventory;

    private ProductController() {
        this.inventory = new HashMap<>() {{
            put(ProductType.GOIABA, new Product(1, .5));
            put(ProductType.MORANGO, new Product(2, .75));
            put(ProductType.MACA_VERDE, new Product(3, .75));
            put(ProductType.NESCAU_COM_NUTELLA, new Product(4, 1));
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
