package exRelampagoSurpresaHalloween;

import java.util.ArrayList;
public class Professor extends Pessoa{
    public final ArrayList<Turma> turmas;

    public Professor(String nome, ArrayList<Turma> turmas) {
        super(nome);
        this.turmas = new ArrayList<Turma>();
    }
}
