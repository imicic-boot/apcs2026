
/**
 * Transform a string
 *
 * Ivana Micic
 * 8/31/2026 
*/

import java.util.Scanner;
public class TextTransformer
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Text Transformer");
        System.out.println("----------------------------");
        
        System.out.print("Enter a motivational quote: ");
        String phrase = scan.nextLine();
        
        // The length method returns the number of characters in a string
        int phraseLength = phrase.length();
        System.out.println("Total Characters (including spaces): "+phraseLength);
        
        // The replace method returns a new version of the old String
        // and replaces the first character with the second character.
        // The original String is NOT modified
        String securePhrase = phrase.replace('e','3');
        securePhrase = securePhrase.replace('a','@');
        
        System.out.println("Modified Phrase: " + securePhrase);
        System.out.println("Original Phrase: " + phrase);
        
        // Get the first 5 characters of our string
        // Example: You miss 100% of the shots you don't take
        // Indexx #: 0,1,2,3,4,5,6,7,8,9..
        // Substring returns a String from the first index number
        // to the second index number (exclusive)
        // prefix = You m
        String prefix = phrase.substring(0,5);
        System.out.println("First 5 characters: " + prefix);
        
        // Returns a string from the given index number (inclusive)
        // to the end of the original String
        // output = iss 100% of the shot you don't take
        String remainder = phrase.substring(5);
        System.out.println("Remaining Characters: " + remainder);
        
    }
}