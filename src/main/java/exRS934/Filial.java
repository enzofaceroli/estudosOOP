package exRS934;

public class Filial {
    private Empresa empresa;
    private Cidade cidade;

    public Filial(Empresa empresa, Cidade cidade) {
        this.setEmpresa(empresa);
        this.setCidade(cidade);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        if (empresa == null) {
            throw new IllegalArgumentException("Empresa invalida");
        } else {
            this.empresa = empresa;
        }
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        if (cidade == null) {
            throw new IllegalArgumentException("Cidade invalida");
        } else {
            this.cidade = cidade;
        }
    }

    public Funcionario getDiretorEmpresa() {
        return this.empresa.getDiretor();
    }

    public String getNomeDiretorEmpresa() {
        return this.getDiretorEmpresa().getNome();
    }
}
