/*
 * Exercise 2: String Concatenation
 * 
 * Write a program that asks the user for their first and last name separately,
 * then joins them with a space in between and prints the full name.
 */
import java.util.Scanner;

public class Exercise2_StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        // TODO: Concatenate the first and last name with a space in between
        // using the + operator or concat() method

        // formating the full name
        System.out.print("Your full name is " + firstName + " " + lastName);
        
        scanner.close();
    }
}

// Expected output (if input is "John" and "Smith"):
// Your full name is John Smith.

