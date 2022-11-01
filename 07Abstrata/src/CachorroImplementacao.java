public class CachorroImplementacao extends AnimalAbstrato {
    public CachorroImplementacao() {
        super("Au au");
    }

    @Override
    protected String emitirSom() {
        return "Au au";
    }

    @Override
    public String movimentar() {
        return "Correndo...";
    }
}
