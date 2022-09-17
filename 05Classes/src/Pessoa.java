public class Pessoa{
    public String nome;
    public String sobrenome;


    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

     public String getNomeCompleto(){
         return getNome() + " " + getSobrenome();
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}
