
public class AlunoEnsinoMedio extends Aluno
{
    public AlunoEnsinoMedio(String nome, float notaProva1, float notaProva2, String matricula){
        super(nome, notaProva1, notaProva2, matricula);
    }
    
    public boolean isAprovado(){
        float notaFinal = (notaProva1 + notaProva2) / 2;
        if (notaFinal >= 6){
            return true;
        } else {
            return false;
        }
    }
    
    public void informacoesAluno(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        if (this.isAprovado()){
            System.out.println ("Aprovado");
        } else {
            System.out.println ("Reprovado");
        }
    }
    
}
