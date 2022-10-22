public class Carro {
    public String modelo;
    public Integer anoFabricacao;
    public String cor;
    public String fabricante;

    public Carro(String modelo, Integer anoFabricacao, String cor, String fabricante) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.fabricante = fabricante;
    }

    public String getModelo(String modelo){
        this.modelo = modelo;
        return modelo;
    }

    public Integer getAnoFabricacao(Integer anoFabricacao){
        this.anoFabricacao = anoFabricacao;
        return anoFabricacao;
    }

    public String getCor(String cor){
        this.cor = cor;
        return cor;
    }

    public String getFabricante(String fabricante){
        this.fabricante = fabricante;
        return fabricante;
    }
}