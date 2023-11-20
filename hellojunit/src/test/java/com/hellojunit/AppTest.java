package com.hellojunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void helloWorldTest() {
        assertEquals("Hello World!", App.helloWorld("World"));
        assertEquals("Hello JUnit!", App.helloWorld("JUnit"));
    }
}
