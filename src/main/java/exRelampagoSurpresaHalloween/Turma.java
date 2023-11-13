package exRelampagoSurpresaHalloween;

import java.util.ArrayList;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private Curso curso;
    private ArrayList<Aluno> alunos;

    public Turma(Disciplina disciplina, Professor professor) {
        this.setDisciplina(disciplina);
        this.setProfessor(professor);
        this.alunos = new ArrayList<Aluno>();
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        if (disciplina == null) {
            throw new IllegalArgumentException("Disciplina invalida");
        }
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if (professor == null) {
            throw new IllegalArgumentException("Professor invalido");
        } else {
            this.professor = professor;
        }
    }

    public boolean verificarMatricula(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public void matricular(Aluno aluno) {
        if (!this.verificarMatricula(aluno)){
            this.alunos.add(aluno);
        } else {
            throw new IllegalArgumentException("Aluno ja esta matriculado na turma");
        }
    }

    public void removeAluno(Aluno aluno) {
        if (this.verificarMatricula(aluno)){
            this.alunos.remove(aluno);
        } else {
            throw new IllegalArgumentException("Aluno nao esta matriculado na turma");
        }
    }

    public int getNumeroAlunos() {
        return this.alunos.size();
    }

    public String getNomeProfessor() { return this.getProfessor().getNome(); }

    public String[] getNomeAlunos() {
        String[] listaNomeAlunos = new String[this.getNumeroAlunos()];
        for (int i = 0; i < this.getNumeroAlunos(); i++){
            listaNomeAlunos[i] = this.alunos.get(i).getNome();
        }
        return listaNomeAlunos;
    }
}


