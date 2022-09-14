import java.security.PublicKey;

public class Fogao{
    public int bocas;
    private String marca;
    private boolean ligado = false;


    public String getMarca() {
        return marca;
    }
    public int getBocas(){
        return bocas;
    }
    public boolean estaLigado() {
        return ligado;
    }
    public Fogao(){
        this.bocas = getBocas();
        this.marca = getMarca();
    }
    public Fogao(int bocas, String marca){
        this.bocas = getBocas();
        this.marca = getMarca();
    }
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }

}
