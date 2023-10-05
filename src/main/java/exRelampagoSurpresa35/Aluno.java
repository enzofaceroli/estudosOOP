
public class Aluno extends Pessoa
{
    protected float notaProva1;
    protected float notaProva2;
    protected String matricula;
    protected boolean aprovado; 
    
    public Aluno(String nome, float notaProva1, float notaProva2, String matricula){
        super(nome);
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.matricula = matricula;
    }
    
    public void setNotaProva1(float notaProva1){
        this.notaProva1 = notaProva1;
    }
    
    public void setNotaProva2(float notaProva2){
        this.notaProva2 = notaProva2;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public float getNotaProva1(){
        return this.notaProva1;
    }
    
    public float getNotaProva2(){
        return this.notaProva2;
    }
    
    public String getMatriula(){
        return this.matricula;
    }
    
    
    
    
}
