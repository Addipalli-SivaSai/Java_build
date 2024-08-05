package com.test.HelloWorldMaven;

 
import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
   
    @Test
    public void testAppMessage()
    {
        assertEquals("Hello World!", "Hello World!");
    }
}

