public class Flau {
    private String sabor;
    private double valor;

    public Flau(String sabor, double valor) {
        this.sabor = sabor;
        this.valor = valor;
    }

    public String sabor() {
        return this.sabor;
    }

    public double valor() {
        return this.valor;
    }
}