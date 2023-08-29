
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuncionarioTest
{
    @Test
    public void deveRetornar8500 (){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Enzo");
        funcionario.setSalarioBruto(10000.00f);
        funcionario.setTotalAcrescimos(2000.00f);
        funcionario.setTotalDescontos(3500.00f);
        assertEquals(8500.00f, funcionario.calculaSalarioLiquido());
    }
    
    @Test
    public void deveRetornar00 (){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Enzo");
        funcionario.setSalarioBruto(5000.00f);
        funcionario.setTotalAcrescimos(2000.00f);
        funcionario.setTotalDescontos(7000.00f);
        assertEquals(00.00f, funcionario.calculaSalarioLiquido());
    }
    
    @Test
    public void deveRetornar5000 (){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Enzo");
        funcionario.setSalarioBruto(6000.00f);
        funcionario.setTotalAcrescimos(3000.00f);
        funcionario.setTotalDescontos(4000.00f);
        assertEquals(5000.00f, funcionario.calculaSalarioLiquido());
    }
    
    @Test
    public void deveRetornar7500 (){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Enzo");
        funcionario.setSalarioBruto(10000.00f);
        funcionario.setTotalAcrescimos(2000.00f);
        funcionario.setTotalDescontos(4500.00f);
        assertEquals(7500.00f, funcionario.calculaSalarioLiquido());
    }
    
    @Test
    public void deveRetornar20500 (){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Enzo");
        funcionario.setSalarioBruto(17000.00f);
        funcionario.setTotalAcrescimos(7000.00f);
        funcionario.setTotalDescontos(3500.00f);
        assertEquals(20500.00f, funcionario.calculaSalarioLiquido());
    }
}
