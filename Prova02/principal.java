public final class Main {

    public static void main(String[] args) {
        final ProdutoController controller = ProdutoController.getInstance();

        vendas(controller);
        printInventory(controller);
    }

    private static void vendas(ProdutoController controller) {
        // Maria
        controller.vendas(ProductType.GOIABA, 2);
        controller.vendas(ProductType.NESCAU_COM_NUTELLA, 3);
        controller.vendas(ProductType.MENTA, 1);

        // João
        controller.vendas(ProductType.MORANGO, 3);
        controller.vendas(ProductType.MACA_VERDE, 5);

        // Pedro
        controller.vendas(ProductType.MENTA, 2);
        controller.vendas(ProductType.MACA_VERDE, 2);
    }

}
