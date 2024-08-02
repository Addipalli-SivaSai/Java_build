import junit.framework.TestCase;
 
public class CalculatorTest extends TestCase {
    private Calculator calculator;
 
    public CalculatorTest(String name) {
        super(name);
    }
 
    public static Test suite() {
        return new TestSuite(CalculatorTest.class);
    }
 
    public void setUp() {
        calculator = new Calculator();
    }
 
    public void tearDown() {
        calculator = null;
    }
 
    public void testAdd() {
        int result = calculator.add(2, 2);
        assertEquals(4, result);
    }
 
    public void testSubtract() {
        int result = calculator.subtract(4, 2);
        assertEquals(2, result);
    }