package com.sorteraarray;

import static org.junit.Assert.assertArrayEquals;
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
    public void sortArrayTest() {
        int[] numbers = {8, 10, 1, 5};
        
        int[] result = app.sortArray(numbers);

        int[] correctResult = {1, 5, 8, 10};

        int[] wrongResult = {1, 5, 10, 8}; //För att testa fel

        assertArrayEquals(correctResult, result); //Rätt svar
        //assertArrayEquals(wrongResult, result); //Fel svar
    }
}
