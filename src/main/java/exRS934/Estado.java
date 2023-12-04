package exRS934;

public class Estado {
    private String nome;
    private Pais pais;

    public Estado(String nome, Pais pais) {
        this.setNome(nome);
        this.setPais(pais);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome invalido");
        } else {
            this.nome = nome;
        }
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        if (pais == null) {
            throw new IllegalArgumentException("Pais invalido");
        } else {
            this.pais = pais;
        }
    }
}
