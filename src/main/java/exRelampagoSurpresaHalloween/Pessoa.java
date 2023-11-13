package exRelampagoSurpresaHalloween;

import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private final ArrayList<Turma> turmas;

    public Pessoa (String nome){
        this.setNome(nome);
        this.turmas = new ArrayList<Turma>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null){
            throw new IllegalArgumentException("A pessoa deve ter um nome");
        } else {
            this.nome = nome;
        }
    }
}
