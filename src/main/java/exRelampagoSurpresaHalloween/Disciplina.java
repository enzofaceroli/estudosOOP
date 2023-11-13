package exRelampagoSurpresaHalloween;

import java.util.ArrayList;
public class Disciplina {
    private String codigo;
    private final ArrayList<Turma> turmas;

    public Disciplina(String codigo, ArrayList<Turma> turmas) {
        this.setCodigo(codigo);
        this.turmas = new ArrayList<Turma>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null){
            throw new IllegalArgumentException("Codigo de disciplina invalido");
        } else {
            this.codigo = codigo;
        }
    }
}
