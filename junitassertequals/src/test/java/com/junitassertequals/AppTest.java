package com.junitassertequals;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

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
    public void bondalizerTest() {
        assertEquals("My name is Bond, James Bond", App.bondalizer("James", "Bond"));
    }

    @Test
    public void returnTotalTest() {
        List<Integer> scores = new ArrayList<>(Arrays.asList(4, 8, 15, 16, 23, 42));
        assertEquals(108, App.returnTotal(scores));
    }
}
