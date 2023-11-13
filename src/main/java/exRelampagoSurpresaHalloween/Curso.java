package exRelampagoSurpresaHalloween;

import java.util.ArrayList;
public class Curso {
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public Curso(ArrayList<Turma> turmas, ArrayList<Aluno> alunos) {
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();
    }

    public boolean verificaMatricula(Aluno aluno) { return this.alunos.contains(aluno); }

    public boolean verificaTurma(Turma turma) { return this.turmas.contains(turma); }

    public void removeTurma(Turma turma) {
        if (!this.turmas.contains(turma)){
            throw new IllegalArgumentException("Turma nao esta no curso");
        } else {
            this.turmas.remove(turma);
        }
    }

    public void removeAluno(Aluno aluno) {
        if (!this.alunos.contains(aluno)){
            throw new IllegalArgumentException("Aluno nao esta na turma");
        } else {
            this.alunos.remove(aluno);
        }
    }

    public String[] getNomeProfessores(){
        String[] listaNomeProfessores = new String[this.turmas.size()];
        for (int i = 0; i < this.turmas.size(); i++){
            listaNomeProfessores[i] = this.turmas.get(i).getNomeProfessor();
        }
        return listaNomeProfessores;
    }

    public String[] getNomeAlunos(){
        String[] listaNomeAlunos = new String[this.alunos.size()];
        for (int i = 0; i < this.alunos.size(); i++){
            listaNomeAlunos[i] = this.alunos.get(i).getNome();
        }
        return listaNomeAlunos;
    }
}
