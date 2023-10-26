package com.xpanxion.assignments.student;
import java.util.Scanner;                   // import Scanner class
import java.util.StringTokenizer;           // import StringTokenizer class

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

        Uppercase Name
        1. prompt user to enter name
        2. save name to String variable
        3. use .toUpperCase to put name in uppercase letters
        4. print name
        */

        // Get user input
        System.out.print("Enter your name: ");
        String name = console.nextLine();       // to hold user name

        // Print name in uppercase
        System.out.println("Your name in upper case is: " + name.toUpperCase());

    }

    public void ex2() {
        /*
        This method prompts the user to enter a String and counts the number of uppercase letters.

        PSEUDOCODE:

        Count Uppers
        1. get user input
        2. save user input as a string
        3. initialize count as 0 to hold number of uppercase letters in string
        4. loop through characters in string
        5. if character uppercase, increment count by 1
        6. After loop end, print count
        */

        // Get user input
        System.out.print("Enter a string: ");
        String sentence = console.nextLine();

        int count = 0;      // to hold the number of uppercase letters in string

        // Loop through indexes in sentence, 0 to final index
        for (int i = 0; i < sentence.length(); i++){
            // if character at index same as uppercase version of char, and character is letter
            if ((sentence.charAt(i) == (sentence.toUpperCase().charAt(i)))
                    && (Character.isUpperCase(sentence.charAt(i)))){
                count++;        // increment count
            }

        }
        System.out.println("Number of uppercase letters: " + count + " .");
    }

    public void ex3() {
        /*
        This method prompts the user to enter a string and capitalizes every
        other word, starting with the first word. Print out the resulting string.

        PSEUDOCODE:

        Capitalize Words:
        1. get user input
        2. save user input as string
        3. use StringTokenizer to split string on delimeter " "
        4. iterate through StringTokenizer, skipping every other string start from 0
        5. capitalize first index of String (the first letter in each part)
        6. print in pairs

         */

        // Get user input
        System.out.print("Enter a string: ");
        String sentence = console.nextLine();

        // Create tokenizer object
        StringTokenizer st = new StringTokenizer(sentence, " ");

        // Loop through the tokens (words in sentence)
        for (int i = 0; i < st.countTokens()+ 2; i+= 2){
            String currentToken = st.nextToken();       // to hold next token
            char capitalFirst = Character.toUpperCase(currentToken.charAt(0));      // capitalize first letter

            // Print capitalized token and one after it with spaces between
            System.out.print(capitalFirst + currentToken.substring(1) + " " + st.nextToken() + " ");
        }

    }

    public void ex4() {
        /*
        This method tests if a word is a palindrome or not.

        PEUDOCODE:

        Classic Palindrome:
        1. get user word as input
        2. initialize a Stringbuilder object, starts with no letters, to hold letters from user word
        3. if word has odd letters, add middle letter into Stringbuilder object
        4. then loop through remaining letters in word
        5. check if both letters on opposite sides of middle are the same, add letters to Stringbuilder
        6. if Stringbuilder same length as original word, then it is a palindrome
        7. else, it is not a palindrome
        */

        // Get user word input
        System.out.print("Enter string: ");
        String word = console.nextLine();

        // Initialize built_word to hold matching letters
        StringBuilder built_word = new StringBuilder(word.length());


        if (word.length() % 2 != 0) {       // if word has odd length
            built_word.append(word.charAt(word.length()/2));    // add middle char to built_word
        }

        // Loop through indexes for first half of word
        for (int i = 0; i< word.length()/2; i++){
            // if character in first half matches character in second
            if (word.charAt(i) == word.charAt((word.length() - 1) - i)) {
                // insert character in first half of built_word
                built_word.insert(i,word.charAt(i));
                // append character to end of built_word
                built_word.append( word.charAt(i));
            }
        }

        // if length of built word same as length of original word
        if (built_word.length() == word.length()){
            // if lengths match, it is a palindrome
            System.out.println("YES");
        } else{     // if not matching, not a palindrome
            System.out.println("NO");
        }

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
