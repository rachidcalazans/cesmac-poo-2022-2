import java.text.DecimalFormat;

public final class PetShop {

    public static void main(String[] args) {
        final TaskController controller = TaskController.getInstance();
        final DecimalFormat format = new DecimalFormat("#,###.###");

        controller.add(new Task("Amora", TaskType.BATH));
        controller.add(new Task("Batata", TaskType.GROOM));
        controller.add(new Task("Esmeralda", TaskType.BATH_GROOM));

        for (Task task : controller.getTasks()) {
            System.out
            .format(
                    "Procedimento de %s, no pet %s, R$ %s",
                    task.getType().getName(),
                    task.getName(),
                    task.getPrice()
            ).println();
        }

        System.out.format("Total recebido: R$ %s", format.format(controller.getTotalMoney())).println();
    }

}
