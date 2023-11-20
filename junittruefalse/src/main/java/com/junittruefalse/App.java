package com.junittruefalse;

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

    public static boolean isEven(int week) {
        //return true; //Sätter return till true i början av projektet för att bli av med rött felmeddelande

        if (week % 2 == 0) { //% är modulus
            return true;
        } else {
            return false;
        }
    }

}
