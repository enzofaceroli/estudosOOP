import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProfessorTest {
    @Test
    public void deveRetornarMarcoMestrado(){
        Professor professor = new Professor("Marco", "Mestrado");
        assertEquals("Marco", professor.getNome());
        assertEquals("Mestrado", professor.getTitulacao());
    }
    
    @Test
    public void deveRetornarSilvanaDoutorado(){
        Professor professor = new Professor("Silvana", "Doutorado");
        assertEquals("Silvana", professor.getNome());
        assertEquals("Doutorado", professor.getTitulacao());
    }
}