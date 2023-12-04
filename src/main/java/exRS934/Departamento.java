package exRS934;

public class Departamento {
    private Empresa empresa;
    private Funcionario chefia;

    public Departamento(Empresa empresa) {
        this.setEmpresa(empresa);
    }

    public Departamento(Empresa empresa, Funcionario chefia) {
        this.setEmpresa(empresa);
        this.chefia = chefia;
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

    public Funcionario getChefia() {
        return chefia;
    }

    public void setChefia(Funcionario chefia) {
        this.chefia = chefia;
    }

    public String getEscolaridadeChefia() {
        if (this.getChefia() == null) {
            return "Depto sem chefia";
        } else {
            return this.chefia.getEscolaridade().getDescricao();
        }
    }
}
