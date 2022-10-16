public class produto {

    private final int id;
    private final double preco;
    private int qtd;

    public Produto(int id, double preco, int qtd) {
        this.id = id;
        this.price = preco;
        this.qtd = qtd;
    }

    public Produto(int id, double preco) {
        this(id, preco, 10);
    }

    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void vendas() {
        if (qtd == 0) throw new UnsupportedOperationException("Esse produto não está em estoque");

        setQtd(getQtd() - 1);
    }

}