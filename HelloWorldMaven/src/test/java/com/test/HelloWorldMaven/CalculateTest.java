package com.test.HelloWorldMaven;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculateTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }   
}
