import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoEnsinoMedioTest
{
    @Test
    public void deveRetornarAprovado(){
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio("Enzo", 6.0f, 6.0f, "12345");  
        assertEquals(true, alunoEnsinoMedio.isAprovado());
    }
    
    @Test
    public void deveRetornarReprovado(){
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio("Enzo", 5.8f, 6.0f, "12345");  
        assertEquals(false, alunoEnsinoMedio.isAprovado());
    }
    
}