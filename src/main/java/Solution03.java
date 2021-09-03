/*
 *  UCF COP3330 Fall 2021 Assignment1 Solution for Pb3
 *  Copyright 2021: Praween Pongpat
 */

import java.util.Scanner;

public class Solution03 {
/*
    print (prompt user) "What is the quote?"
    'quote' = read string from user
    print (prompt user) "Who said it?"
    'author' = read string from user
    print (output) "'author' says, "'quote'."
 */
    public static void main(String[] args) {    //beginning of main method
        System.out.print("What is the quote? ");        //prompt user for the Quote

        Scanner input = new Scanner(System.in);         //allocate input using Scanner class from API
        String quote = input.nextLine();                //read string for the Quote

        System.out.print("Who said it? ");              //prompt user for the author's name

        String author = input.nextLine();               //read string for the author's name

        System.out.println(author + " says, \"" + quote + ".\"");   //print output
    }                                           //end main method
}
