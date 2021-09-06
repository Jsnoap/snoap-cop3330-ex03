/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name;
        String quote;

        System.out.println("What is the quote?");
        Scanner inputQuote = new Scanner(System.in);
        quote = inputQuote.nextLine();

        System.out.println("Who said it?");
        Scanner inputName = new Scanner(System.in);
        name = inputName.nextLine();

        System.out.println(name + " says, " + "\"" + quote + "\"");
    }
}
