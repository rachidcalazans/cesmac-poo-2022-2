public enum Tiproduto {
    M("Menta"),
    G("Goiaba"),
    MV("Maçã Verde"),
    MO("Morango"),
    NES("Nescau com Nutella");

    private final String nomeProduto;

    Tiproduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String retornarNomeProduto() {
        return nomeProduto;
    }

    public static Tiproduto retornarNome(String nome) {
        for (Tiproduto type : values()) {
            if (type.retornarNomeProduto().equalsIgnoreCase(nome)) return type;
        }

        return null;
    }
}
