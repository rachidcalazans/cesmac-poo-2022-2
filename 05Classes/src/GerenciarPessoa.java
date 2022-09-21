import java.util.ArrayList;

public class GerenciarPessoa {
    private ArrayList<Pessoa> pessoas;

    public GerenciarPessoa(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public ArrayList<Pessoa> pessoas() {
        return this.pessoas;
    }

    public void addPessoa(Pessoa novaPessoa) {
        this.pessoas.add(novaPessoa);
    }
}
