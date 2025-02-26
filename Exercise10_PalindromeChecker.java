/*
 * Exercise 10: Palindrome Checker
 * 
 * Write a program that asks the user for a string and checks
 * if it's a palindrome (reads the same backward as forward).
 * Ignore case sensitivity.
 */
import java.util.Scanner;

public class Exercise10_PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // TODO: Check if the string is a palindrome and print the result


        StringBuilder palindromeCheck = new StringBuilder(input);
        String reversed = palindromeCheck.reverse().toString();

        if(input.equalsIgnoreCase(reversed)){
            System.out.println( "\"" + input + "\" is a palindrome");
        }else {
            System.out.println("\"" + input + "\" is not a palindrome");
        }
        
        scanner.close();
    }
}

// Expected output (if input is "Racecar"):
// "Racecar" is a palindrome.
