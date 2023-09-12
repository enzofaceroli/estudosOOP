import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoGraduacaoTest
{
    @Test
    public void deveRetornarAprovado(){
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao("Enzo", 10.0f, 7.0f, "12345");  
        assertEquals(true, alunoGraduacao.isAprovado());
    }
    
    @Test
    public void deveRetornarReprovado(){
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao("Enzo", 2.0f, 7.0f, "12345");  
        assertEquals(false, alunoGraduacao.isAprovado());
    }
    
}
