
public class Professor extends Pessoa
{
    private String titulacao;
    
    public Professor(String nome, String titulacao){
        super(nome);
        this.titulacao = titulacao; 
    }
    
    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }
    
    public String getTitulacao(){
        return this.titulacao;
    }
    
    public void informacoesProfessor(){
        System.out.println(this.nome);
        System.out.println(this.titulacao);
    }
}
