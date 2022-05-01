import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testFactorial() {
        assertEquals(6, SkillDemo.factorial(3));
    }
}
