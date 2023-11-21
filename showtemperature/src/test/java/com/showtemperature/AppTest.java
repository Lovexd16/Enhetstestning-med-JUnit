package com.showtemperature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 

{

    App app = new App();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void fahrenheitToCelsiusTest() {
        int ourResult = 10;
        int ourNum = 50;

        assertEquals(ourResult, app.fahrenheitToCelsius(ourNum)); //rätt svar //Med variabel
        assertEquals(20, app.fahrenheitToCelsius(8)); //Fel svar
        assertEquals(30, app.fahrenheitToCelsius(86)); //Rätt svar
    }

    @Test
    public void celsiusToFahrenheitTest() {
        int ourResult = 68;
        int ourNum = 20;
        
        assertEquals(ourResult, app.celsiusToFahrenheit(ourNum)); //rätt svar //med variabel
        //assertEquals(12, app.celsiusToFahrenheit(72));// Fel svar
        assertEquals(104, app.celsiusToFahrenheit(40)); //Rätt svar
    }
}
