public class Flau{
    public String sabor;
    public Double valor;

    public String getSabor() {
        return sabor;
    }

    public Double getValor() {
        return valor;
    }

    public Flau(){
        this.sabor = getSabor();
        this.valor = getValor();
    }
    public Flau(String sabor, Double valor){
        this.sabor = getSabor();
        this.valor = getValor();
    }
}

/*public abstract class Flau {

      Definindo os atributos da classe flau

    private String sabor;
    private Double preco;
    private Integer estoque;

    public Flau(String sabor){
        Esse é o construtor da classe
        this.sabor = sabor;
    }

    public String getSabor(){
        return sabor;
    }

    // Metodos

    public void setReduzirEstoque(int quantidade){
        /* Esse metodo serve para reduzir o estoque quando algum produto for vendido
         * caso a quantidade seja maior que o estoque o metodo deve alertar e não executar a ação

        if (quantidade <= estoque) {
            estoque = estoque - quantidade;
        }
        else{
            System.out.println("Estoque indisponivel");
        }
    }

}
*/
