public class Carro {
    public String modelo;
    public double preco;


    public String getModelo(){
        return modelo;
    }

    public double getPreco(){ return preco;}
    public Carro(){
        this.modelo = getModelo();
        this.preco = getPreco();
    }
    public Carro(String modelo, Double preco ){
        this.modelo = getModelo();
        this.preco = getPreco();
    }

}

