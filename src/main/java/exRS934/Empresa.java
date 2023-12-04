package exRS934;

public class Empresa {
    private Funcionario diretor;
    private Grupo grupo;

    public Empresa (Grupo grupo) {
        this.setGrupo(grupo);
    }

    public Empresa(Funcionario diretor, Grupo grupo) {
        //Caso -> abrir empresa sem um diretor
        this.diretor = diretor;
        this.setGrupo(grupo);
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        if (grupo == null) {
            throw new IllegalArgumentException("Grupo invalido");
        } else {
            this.grupo = grupo;
        }
    }

    public Pais getPaisGrupo() {
        return this.getGrupo().getSede();
    }

    public String getNomePaisGrupo() {
        return this.getPaisGrupo().getNome();
    }
}
