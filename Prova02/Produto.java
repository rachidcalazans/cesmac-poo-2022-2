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

