/*
 * Exercise 6: Character Extraction
 * 
 * Write a program that asks the user for a word and then prints:
 * 1. The first character
 * 2. The last character
 * 3. The middle character (or two middle characters if the length is even)
 */
import java.util.Scanner;

public class Exercise6_CharacterExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        // TODO: Extract and print the first, last, and middle character(s)

        // formatting the output for the 1st and last characters
        int stringLength = word.length() - 1;
        System.out.println("First Character: " + word.charAt(0));
        System.out.println("Last character: " + word.charAt(stringLength));

        // initializing the variable for use to keep code clean
        int wordLength = word.length();
        int oddMiddle = (word.length()-1)/2;
        int evenMiddleLeft = (word.length()-2)/2;
        int evenMiddleRight = word.length()/2;

        // setting conditional to handle odd and even numbered string lengths
        if(wordLength%2 == 1){
            System.out.println("Middle Character: " + word.charAt(oddMiddle));
        }else{
            System.out.println("Middle Characters are: " + word.charAt(evenMiddleLeft) + word.charAt(evenMiddleRight));
        }

        
        scanner.close();
    }
}

// Expected output (if input is "Programming"):
// First character: P
// Last character: g
// Middle character(s): am
