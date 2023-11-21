package com.sorteraarray;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int[] sortArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }
}
