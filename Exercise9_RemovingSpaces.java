/*
 * Exercise 9: Removing Spaces
 * 
 * Write a program that asks the user for a sentence and then prints
 * the same sentence with all spaces removed.
 */
import java.util.Scanner;

public class Exercise9_RemovingSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // TODO: Remove all spaces from the sentence using replace() or replaceAll()

        // creating a new string object to hold space deleted string
        String newSentence = sentence.replace(" ", "");

        System.out.println(newSentence);


        
        scanner.close();
    }
}

// Expected output (if input is "Java is awesome"):
// Without spaces: Javaisawesome
