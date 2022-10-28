import java.util.HashMap;
import java.util.Map;

public final class Controlador {

    private static final Controlador INSTANCE = new Controlador();

    private final Map<Tiproduto, Produto> inventario;

    private Controlador() {
        this.inventario = new HashMap<>() {{
            put(Tiproduto.G, new Produto(1, .5));
            put(Tiproduto.MO, new Produto(2, .75));
            put(Tiproduto.MV, new Produto(3, .75));
            put(Tiproduto.NES, new Produto(4, 1));
            put(Tiproduto.M, new Produto(5, .5));
        }};
    }

    public Map<Tiproduto, Produto> retornarInventario() {
        return inventario;
    }

    public boolean Disponibilidade(Tiproduto type) {
        return retornarInventario().get(type).retornarQuantidade() > 0;
    }

    public void venda(Tiproduto type) {
        try {
            retornarInventario().get(type).venda();
        } catch (UnsupportedOperationException excessao) {
            System.out.format("O estoque de %s acabou.", type.retornarNomeProduto()).println();
        }
    }

    public void venda(Tiproduto type, int quantidade) {
        for (int vezes = 0; vezes < quantidade; vezes++) venda(type);
    }

    public double retornarVendasTotais() {
        double total = 0;

        for (Produto produto retornarInventario().values()) {
            final int vezesVendas = 10 - produto.retornarQuantidade();

            total += vezesVendas * produto.retornarPreco();
        }

        return total;
    }

    public static Controlador retornarInstancia() {
        return INSTANCE;
    }

}
