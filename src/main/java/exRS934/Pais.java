package exRS934;

public class Pais {
    private String nome;

    public Pais(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome invalido");
        } else {
            this.nome = nome;
        }
    }
}
