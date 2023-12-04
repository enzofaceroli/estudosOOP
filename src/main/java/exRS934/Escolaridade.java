package exRS934;

public class Escolaridade {
    private String descricao;

    public Escolaridade(String descricao) {
        //Ex: pessoa sem escolaridade (nao terminou escola)
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
