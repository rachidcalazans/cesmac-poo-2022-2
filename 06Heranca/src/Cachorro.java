public class Cachorro extends Animal {
    public Cachorro() {
        super("Au au");
    }

    @Override
    public String movimentar() {
        return "Correndo...";
    }
}