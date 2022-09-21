public class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public String nomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }
}
