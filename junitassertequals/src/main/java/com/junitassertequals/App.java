package com.junitassertequals;

import java.util.List;

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

    public static String bondalizer(String first, String last) {
        return "My name is " + last + ", " + first + " " + last;
    }

    public static int returnTotal(List<Integer> scores) {
        int score = 0;

        for (int point : scores) {
            score += point;
        }
        return score;
    }

}
