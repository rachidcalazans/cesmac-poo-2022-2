public class Fogao {
    public int bocas;
    private String marca;
    private boolean ligado = false;
    // Adições
    private boolean ligar;
    private boolean desligar;

    ////////////

    public String getMarca(){
        return "";
    }

    ////////////

    public int getBocas(){
        return 0;
    }

    ////////////

    public boolean estaLigado(){
        return ligado;
    }

    ////////////

    public Fogao(){
        this.marca = getMarca();
        this.bocas = getBocas();
    }

    ////////////

    public Fogao(int bocas, String marca){
        this.bocas = getBocas();
        this.marca = getMarca();
    }

    ////////////

    public Fogao(boolean ligado){
        this.ligar = estaLigado();
        this.desligar = estaLigado();
    }

    ////////////

    public void ligar(){
        this.ligado = true;
    }

    ////////////

    public void desligar(){
        this.ligado = false;
    }
}
