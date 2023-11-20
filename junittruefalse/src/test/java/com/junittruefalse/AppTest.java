package com.junittruefalse;

import static org.junit.Assert.assertFalse;
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

    //1.Analysera krav, 2.sen skapa testerna utifrån kraven. 3.Gör templates för funktionerna så de finns i projektet. 4.Testa testerna för att se till att dem failar. 5.Skriv logiken i metoderna
    @Test
    public void isEvenTest() { //Döp alltid test metoden till samma som metoden med Test i slutet
        assertTrue(App.isEven(2)); //Testa olika case, sånt som ska vara true och sånt som ska vara false för att fånga ännu mer buggar
        assertFalse(App.isEven(5));
    }

}
