package exRS934;

public class Grupo {
    private Pais sede;
    private Funcionario presidente;

    public Grupo (Pais sede) {
        this.setSede(sede);
    }

    public Grupo (Pais sede, Funcionario presidente) {
        this.setSede(sede);
        // Ex: grupo momentaneamente sem presidente
        this.presidente = presidente;
    }

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        if (sede == null) {
            throw new IllegalArgumentException("Pais invalido");
        } else {
            this.sede = sede;
        }
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getEscolaridadePresidente() {
        if(this.getPresidente() == null) {
            return "Grupo sem presidente";
        }
        return this.getPresidente().getEscolaridade().getDescricao();
    }

}
