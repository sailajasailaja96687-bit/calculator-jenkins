import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }
    @Test
    public void testSubtraction() {
        assertEquals(6, calculator.subtract(10, 4));
    }
    @Test
    public void testMultiplication() {
        assertEquals(20, calculator.multiply(5, 4));
    }
    @Test
    public void testDivision() {
        assertEquals(4, calculator.divide(20, 5));
    }
}
