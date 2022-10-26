import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Vendinha {
    private double saldo;
    private ArrayList<Flau> estoque;

    public Vendinha() {
        this.saldo = 0.0;
        this.estoque = new ArrayList<>();
        estoque.add(new Flau("goiaba", 0.5));
        estoque.add(new Flau("goiaba", 0.5));
        estoque.add(new Flau("goiaba", 0.5));
        estoque.add(new Flau("goiaba", 0.5));
        estoque.add(new Flau("goiaba", 0.5));
        estoque.add(new Flau("goiaba", 0.5));
        estoque.add(new Flau("goiaba", 0.5));
        estoque.add(new Flau("goiaba", 0.5));
        estoque.add(new Flau("goiaba", 0.5));
        estoque.add(new Flau("goiaba", 0.5));
        estoque.add(new Flau("morango", 0.75));
        estoque.add(new Flau("morango", 0.75));
        estoque.add(new Flau("morango", 0.75));
        estoque.add(new Flau("morango", 0.75));
        estoque.add(new Flau("morango", 0.75));
        estoque.add(new Flau("morango", 0.75));
        estoque.add(new Flau("morango", 0.75));
        estoque.add(new Flau("morango", 0.75));
        estoque.add(new Flau("morango", 0.75));
        estoque.add(new Flau("morango", 0.75));
        estoque.add(new Flau("maçã verde", 0.75));
        estoque.add(new Flau("maçã verde", 0.75));
        estoque.add(new Flau("maçã verde", 0.75));
        estoque.add(new Flau("maçã verde", 0.75));
        estoque.add(new Flau("maçã verde", 0.75));
        estoque.add(new Flau("maçã verde", 0.75));
        estoque.add(new Flau("maçã verde", 0.75));
        estoque.add(new Flau("maçã verde", 0.75));
        estoque.add(new Flau("maçã verde", 0.75));
        estoque.add(new Flau("maçã verde", 0.75));
        estoque.add(new Flau("nescau com nutella", 1.0));
        estoque.add(new Flau("nescau com nutella", 1.0));
        estoque.add(new Flau("nescau com nutella", 1.0));
        estoque.add(new Flau("nescau com nutella", 1.0));
        estoque.add(new Flau("nescau com nutella", 1.0));
        estoque.add(new Flau("nescau com nutella", 1.0));
        estoque.add(new Flau("nescau com nutella", 1.0));
        estoque.add(new Flau("nescau com nutella", 1.0));
        estoque.add(new Flau("nescau com nutella", 1.0));
        estoque.add(new Flau("nescau com nutella", 1.0));
        estoque.add(new Flau("menta", 0.5));
        estoque.add(new Flau("menta", 0.5));
        estoque.add(new Flau("menta", 0.5));
        estoque.add(new Flau("menta", 0.5));
        estoque.add(new Flau("menta", 0.5));
        estoque.add(new Flau("menta", 0.5));
        estoque.add(new Flau("menta", 0.5));
        estoque.add(new Flau("menta", 0.5));
        estoque.add(new Flau("menta", 0.5));
        estoque.add(new Flau("menta", 0.5));
    }

    double saldo() {
        return this.saldo;
    }

    public ArrayList<Flau> estoque() {
        return this.estoque;
    }

    public ArrayList<Flau> estoqueDeGoiaba() {
        ArrayList<Flau> estoqueDeSabor = new ArrayList<>();

        for (Flau flau : this.estoque) {
            if (flau.sabor().equals("goiaba")) {
                estoqueDeSabor.add(flau);
            }
        }

        return estoqueDeSabor;
    }

    public ArrayList<Flau> estoqueDeMorango() {
        ArrayList<Flau> estoqueDeSabor = new ArrayList<>();

        for (Flau flau : this.estoque) {
            if (flau.sabor().equals("morango")) {
                estoqueDeSabor.add(flau);
            }
        }

        return estoqueDeSabor;
    }

    public ArrayList<Flau> estoqueDeMacaVerde() {
        ArrayList<Flau> estoqueDeSabor = new ArrayList<>();

        for (Flau flau : this.estoque) {
            if (flau.sabor().equals("maçã verde")) {
                estoqueDeSabor.add(flau);
            }
        }

        return estoqueDeSabor;
    }

    public ArrayList<Flau> estoqueDeNescauComNutella() {
        ArrayList<Flau> estoqueDeSabor = new ArrayList<>();

        for (Flau flau : this.estoque) {
            if (flau.sabor().equals("nescau com nutella")) {
                estoqueDeSabor.add(flau);
            }
        }

        return estoqueDeSabor;
    }

    public ArrayList<Flau> estoqueDeMenta() {
        ArrayList<Flau> estoqueDeSabor = new ArrayList<>();

        for (Flau flau : this.estoque) {
            if (flau.sabor().equals("menta")) {
                estoqueDeSabor.add(flau);
            }
        }

        return estoqueDeSabor;
    }

    public void vender(String sabor) {
        for (Flau flau : this.estoque) {
            if (flau.sabor().equals(sabor)) {
                this.saldo += flau.valor();
                this.estoque.remove(flau);
                break;
            }
        }
    }
}
