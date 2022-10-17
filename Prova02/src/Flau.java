public class Flau{
    public String sabor;
    public Double valor;
    public Integer estoque;
    public Double lucro;
    public String getSabor() {
        return sabor;
    }
    public Double getValor() {
        return valor;
    }
    public Integer getEstoque() {
        return estoque;
    }
    public Double getLucro(){
        return lucro;
    }
    public Flau(String sabor, Double valor, Integer estoque, Double lucro){
        this.sabor = sabor;
        this.valor = valor;
        this.estoque = estoque;
        this.lucro = lucro;
    }


}