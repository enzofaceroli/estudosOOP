package exRS934;
public class Cidade {
    private String nome;
    private Estado estado;

    public Cidade(String nome, Estado estado) {
        this.setNome(nome);
        this.setEstado(estado);
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Estado invalido");
        } else {
            this.estado = estado;
        }
    }
}
