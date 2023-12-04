package exRS934;

public class Funcionario {
    private String nome;
    private Departamento alocacao;
    private Escolaridade escolaridade;
    private Filial coordenacao;

    public Funcionario (String nome) {
        this.setNome(nome);
    }

    public Funcionario(String nome, Departamento alocacao, Escolaridade escolaridade, Filial coordenacao) {
        this.nome = nome;
        this.alocacao = alocacao;
        this.escolaridade = escolaridade;
        this.coordenacao = coordenacao;
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

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public Pais getPaisAlocacao() {
        return this.getAlocacao().getEmpresa().getPaisGrupo();
    }

    public String getNomePaisAlocacao() {
        return this.getPaisAlocacao().getNome();
    }

    public Estado getEstadoCoordenacao() {
        return this.getCoordenacao().getCidade().getEstado();
    }

    public String getNomeEstadoCoordenacao() {
        return this.getEstadoCoordenacao().getNome();
    }
}
