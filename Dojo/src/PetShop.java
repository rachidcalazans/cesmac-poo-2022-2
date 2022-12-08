public class PetShop {
    public double banho;
    public double tosa;

    public double banhoETosa;

    public String nomeDoPet = "O nome do pet é: ";

    public PetShop(String nomeDoPet){this.nomeDoPet = nomeDoPet;}

    protected String exibirNome(){return nomeDoPet;}
    public PetShop() {
        banho = 20.00;
        tosa = 25.00;
        banhoETosa = 38.25;
    }
}
