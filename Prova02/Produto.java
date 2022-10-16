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

        setAmount(getAmount() - 1);
    }

}