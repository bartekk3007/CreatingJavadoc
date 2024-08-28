package com.company.utility;

import java.time.LocalDateTime;

/**
 * @author Bartek
 * @version 1.0.0
 *
 */
public class Main
{
    /**date current LocalDateTime*/
    private final LocalDateTime date = LocalDateTime.now();

    /**
     * @deprecated
     * Introduces your name
     * @param name is place to insert your name
     * @return It prints introduction
     */
    public static String introduce(String name)
    {
        return ("My name is " + name + "\n");
    }

    public static void main(String[] args)
    {
        System.out.println(introduce("Bartek"));
    }
}