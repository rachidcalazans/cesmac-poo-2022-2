public class Fogao {
    public int bocas;
    private String marca;
    private boolean ligado = false;
    private boolean ligar;
    private boolean desligar;

    public String getMarca() {
        return marca;
    }

    public int getBocas() {
        return bocas;
    }

    public boolean estaLigado() {
        return ligado;
    }
    public Fogao(){
        this.bocas = getBocas();
        this.marca = getMarca();
    }
    public Fogao( int bocas, String marca){
        this.bocas = getBocas();
        this.marca = getMarca();
    }
    public Fogao(boolean ligado){
        this.ligar = estaLigado();
        this.desligar = estaLigado();
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }
}
