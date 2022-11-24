public class Pato extends AnimalAbstrato implements Correr {
    @Override
    protected String emitirSom() {
        return "quack";
    }

    @Override
    public String movimentar() {
        return correr();
    }
}