
public class Funcionario
{
    private String nome; 
    private float salarioBruto; 
    private float totalAcrescimos;
    private float totalDescontos; 
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalarioBruto (float salarioBruto){
        this.salarioBruto = salarioBruto;
    }
    public void setTotalAcrescimos(float totalAcrescimos){
        this.totalAcrescimos = totalAcrescimos;
    }
    public void setTotalDescontos(float totalDescontos){
        this.totalDescontos = totalDescontos;
    }
    
    public String getNome(){
        return this.nome;
    }
    public float getSalarioBruto(){
        return this.salarioBruto;
    }
    public float getTotalAcrescimos(){
        return this.totalAcrescimos; 
    }
    public float getTotalDescontos(){
        return this.totalDescontos;
    }
    
    public float calculaSalarioLiquido(){
        float salarioLiquido = (this.getSalarioBruto() + this.getTotalAcrescimos() - this.getTotalDescontos());
        return salarioLiquido;
    }
}
