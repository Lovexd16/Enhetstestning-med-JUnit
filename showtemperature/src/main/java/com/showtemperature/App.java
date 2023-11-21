package com.showtemperature;

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

    public int fahrenheitToCelsius(int num) {
        return (num - 32) * 5 / 9;
    }

    public int celsiusToFahrenheit(int num) {
        return (num * 9 / 5) + 32;
    }
}
