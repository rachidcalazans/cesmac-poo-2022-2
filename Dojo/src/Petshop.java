public class Petshop {

    public String nomeDoPet = "O nome do pet é ";
    public double banho;
    public double tosa;

    public double banhoETosa;

    public Petshop(String nomeDoPet){this.nomeDoPet = nomeDoPet;}

    protected String exibirNome(){return nomeDoPet;}
    public Petshop() {
        banho = 20.00;
        tosa = 25.00;
        banhoETosa = 38.25;
    }
}
