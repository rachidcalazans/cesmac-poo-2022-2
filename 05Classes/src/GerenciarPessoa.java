public class GerenciarPessoa {
   // private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private int[] lista;
    public static final int CAPACIDADE_DEFAULT = 20;
    private int tamanho;

    public ArrayList() {
        this(CAPACIDADE_DEFAULT);
    }

    public boolean add(int Pessoa pessoa) {
        assegureCapacidade(this.tamanho + 1);
        this.lista[this.tamanho++] = pessoa;
        return true;
    }

}
