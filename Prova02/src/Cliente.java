public class Cliente {
    public String nome;
    public String compraSabor;
    public Integer compraQtd;
    public Integer compraLucro;
    public Integer valorEstoque;
    public String getNome(){
        return nome;
    }
    public String getCompraSabor(){
        return compraSabor;
    }
    public Integer getCompraQtd(){
        return compraQtd;
    }
    public Integer getCompraLucro(){
        return compraLucro;
    }
    public Cliente(String nome, String compraSabor, Integer compraQtd){
        this.nome = nome;
        this.compraSabor = compraSabor;
        this.compraQtd = compraQtd;
    }
    public Integer alteraEstoque(){
        return valorEstoque;
    }
    public void Compra(String compraSabor, Integer compraQtd){

    }
}
