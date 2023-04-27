
/**
 * @author Adam Lizerbram
 * @version 9/30/2021
 * 
 * Solves the password puzzle in Keep Talking and Nobody Explodes.
 */
import java.util.*;
import java.util.Scanner;
public class Password
{
    private static ArrayList<String> possibleWords = new ArrayList<String>();
    
    void fillArray() {
        possibleWords.add("about");
        possibleWords.add("after");
        possibleWords.add("again");
        possibleWords.add("below");
        possibleWords.add("could");
        possibleWords.add("every");
        possibleWords.add("first");
        possibleWords.add("found");
        possibleWords.add("great");
        possibleWords.add("house");
        possibleWords.add("large");
        possibleWords.add("learn");
        possibleWords.add("never");
        possibleWords.add("other");
        possibleWords.add("place");
        possibleWords.add("plant");
        possibleWords.add("point");
        possibleWords.add("right");
        possibleWords.add("small");
        possibleWords.add("sound");
        possibleWords.add("spell");
        possibleWords.add("still");
        possibleWords.add("study");
        possibleWords.add("their");
        possibleWords.add("there");
        possibleWords.add("these");
        possibleWords.add("thing");
        possibleWords.add("think");
        possibleWords.add("three");
        possibleWords.add("water");
        possibleWords.add("where");
        possibleWords.add("which");
        possibleWords.add("world");
        possibleWords.add("would");
        possibleWords.add("write");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Password p = new Password();
        p.fillArray();
        ArrayList<String> letters = new ArrayList<String>(6);
        int r = 1;
        int letter = 0;
        boolean containsLetter;
        
        do {
            System.out.print("Row " + r + ": ");
            
            for (int i = 0; i < 6; i++)
                if (letter == 0)
                    letters.add(input.next().toLowerCase());
                else
                    letters.set(i, input.next().toLowerCase());
            
            for (int i = 0; i < possibleWords.size(); i++) {
                containsLetter = false;
                for (int j = 0; j < letters.size(); j++) {
                    if (possibleWords.get(i).charAt(letter) == letters.get(j).charAt(0)) {
                        containsLetter = true;
                        break;
                    }
                }
                if (!containsLetter) {
                    possibleWords.remove(i);
                    i--;
                }
            }
            
            r++;
            letter++;
        } while(possibleWords.size() > 1);
        
        if (possibleWords.size() == 1)
            System.out.println("\nThe word is: " + possibleWords.get(0));
        else
            System.out.println("Word not found. Try again.");
        input.close();
    }
}

