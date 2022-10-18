public final class Principal {

    public static void principal(String[] args) {
        final Controlador controlador = Controlador.retornarInstancia();

        venda(controlador);
        printInventario(controlador);

        System.out.format("Total em vendas hoje: R$ %s", new FormatoDecimal("#,###.###").format(controlador.retornarVendasTotais())).println();
    }

    private static void venda(Controlador controlador) {
        // Maria
        controlador.venda(Tiproduto.G, 2);
        controlador.venda(Tiproduto.NES, 3);
        controlador.venda(Tiproduto.M, 1);

        // João
        controlador.venda(Tiproduto.MO, 3);
        controlador.venda(Tiproduto.MV, 5);

        // Pedro
        controlador.venda(Tiproduto.M, 2);
        controlador.venda(Tiproduto.MV, 2);
    }

    private static void printInventatio(Controlador controlador) {
        for (Map.Entry<Tiproduto, Produto> entry : controlador.retornarInventario().entrySet()) {
            final String nome = entry.retornarChave().retornarNomeProduto();
            final int quantidade = entry.retornarValor().retornarQuantidade();

            System.out.format("Há %s flau(s) do sabor %s disponíveis em estoque;", quantidade, nome).println();
        }
    }

}