package com.xpanxion.assignments.student;
import java.util.Scanner;                   // import Scanner class
public class JavaOne {

    //
    // Constructors
    //
    Scanner console = new Scanner(System.in);

    public JavaOne() {}

    /*
    DELETE THIS LATER!!!
    Navigate to java-I-assignments.md and complete the tasks. For each task:

        Plan your solution
        Pseudocode
        Code
        Test
     */

    //
    // Public methods
    //

    public void ex1() {
        /*
        This method prompts the user to enter their name and prints their name in upper case.

        PSEUDOCODE:
        1. prompt user to enter name
        2. save name to String variable
        3. use .toUpperCase to put name in uppercase letters
        4. print name
        */
        System.out.print("Enter your name: ");
        String name = console.nextLine();

        System.out.println("Your name in upper case is: " + name.toUpperCase());

    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
