// Java String Exercises for Beginners
// Each exercise includes instructions, starter code, and expected output

/*
 * Exercise 1: String Length
 * 
 * Write a program that asks the user to enter their name and 
 * prints out how many characters are in their name.
 */
import java.util.Scanner;

public class Exercise1_StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // TODO: Print the length of the name using the length() method

        // creating a variable to store length of name so its not static
        int nameLength = name.length();

        // formatting the output to make it easier to use
        System.out.print("Your name has " + nameLength + " character");
        

        
        scanner.close();
    }
}

// Expected output (if input is "Maria"):
// Your name has 5 characters.

