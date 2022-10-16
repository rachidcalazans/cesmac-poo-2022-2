public final class Main {

    public static void main(String[] args) {
        final ProductController controller = ProductController.getInstance();

        sell(controller);
        printInventory(controller);

        System.out.format(
                "Total em vendas hoje: R$ %s",
                new DecimalFormat("#,###.###").format(controller.getSoldTotal())
        ).println();
    }

    private static void sell(ProductController controller) {
        // Maria
        controller.sell(ProductType.GOIABA, 2);
        controller.sell(ProductType.NESCAU_COM_NUTELLA, 3);
        controller.sell(ProductType.MENTA, 1);

        // João
        controller.sell(ProductType.MORANGO, 3);
        controller.sell(ProductType.MACA_VERDE, 5);

        // Pedro
        controller.sell(ProductType.MENTA, 2);
        controller.sell(ProductType.MACA_VERDE, 2);
    }

