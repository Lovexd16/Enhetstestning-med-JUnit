package com.junitsetup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    App app = new App(); //Så man inte behöver ha static i App.java
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    //Man har gör alltid en egen test klass till varje klass
    @Test //Skriv @Test så den dyker upp i test
    public void timesTwoTest() { //Test metoder är nästan alltid void
        //SETUP
        //App app = new App(); //Man kan även ha den här
        int ourResult = 4;
        int ourNum = 2;

        //KICK
        int testResult = app.timesTwo(ourNum);

        //VERIFY
        assertEquals(ourResult, app.timesTwo(ourNum));
    }
}
