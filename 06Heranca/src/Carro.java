public class Carro {
    String modelo;
    Integer anoFabricacao;
    String cor;
    String fabricante;

    public Carro() {}

    public Carro(String modelo, Integer anoFabricacao, String cor, String fabricante) {
        this.modelo = modelo;
        this.anoFabricacao  = anoFabricacao;
        this.cor = cor;
        this.fabricante = fabricante;
    }
    public String getModelo(){
        this.modelo = modelo;
        return modelo;
    }
    public Integer getAnoFabricacao(){
        this.anoFabricacao = anoFabricacao;
        return anoFabricacao;
    }
    public String getCor(){
        this.cor = cor;
        return cor;
    }
    public String getFabricate(){
        this.fabricante = fabricante;
        return fabricante;
    }
}
