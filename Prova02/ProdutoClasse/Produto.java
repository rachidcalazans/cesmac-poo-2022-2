public class Produto {

    private final double preco;
    private final int id;
    private int quantidade;

    public Produto(int id, double preco, int quantidade) {
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(double preco, int id) {
        this(id, preco, 10);
    }
    public double retornarPreco() {
        return preco;
    }
    public int retornarId() {
        return id;
    }
    public int retornarQuantidade() {
        return quantidade;
    }

    public void configQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void sell() {
        if (quantidade == 0)
            System.out.print("Item indisponível.");

        configQuantidade(retornarQuantidade() - 1);
    }

}
