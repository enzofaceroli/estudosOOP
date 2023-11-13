package exRelampagoSurpresaHalloween;

public class Aluno extends Pessoa{
    private Curso curso;

    public Aluno(String nome, Curso curso) {
        super(nome); // tem atributo lista de turmas também
        this.setCurso(curso);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        if (curso == null){
            throw new IllegalArgumentException("Curso invalido");
        } else {
            this.curso = curso;
        }
    }
}
