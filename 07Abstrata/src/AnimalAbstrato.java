public abstract class AnimalAbstrato {
    private String som = "Emitindo algum som...";

    public AnimalAbstrato() {}

    public AnimalAbstrato(String som) {
        this.som = som;
    }

    protected abstract String emitirSom();

    public abstract String movimentar();
}
