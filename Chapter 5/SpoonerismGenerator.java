import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        run();
    }

    public static String getWord() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        return scan.nextLine();
    }

    public static int vowelIndex(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    public static void run() {
        String firstWord = getWord();
        String secondWord = getWord();

        int vowelIndexFirst = vowelIndex(firstWord);
        int vowelIndexSecond = vowelIndex(secondWord);

        if (vowelIndexFirst == -1 && vowelIndexSecond == -1) {
            System.out.println("Neither word contains a vowel. Cannot generate a Spoonerism.");
            return;
        } 
        if (vowelIndexFirst == -1) {
            System.out.println("The first word does not contain any vowels. Cannot generate a Spoonerism.");
            return;
        }
        if (vowelIndexSecond == -1) {
            System.out.println("The second word does not contain any vowels. Cannot generate a Spoonerism.");
            return;
        }
        if (vowelIndexFirst == 0 && vowelIndexSecond == 0) {
            System.out.println("Both words start with a vowel. Cannot generate a Spoonerism.");
            return;
        }
        if (vowelIndexFirst == 0) {
            System.out.println("The first word starts with a vowel. Cannot generate a Spoonerism.");
            return;
        }
        if (vowelIndexSecond == 0) {
            System.out.println("The second word starts with a vowel. Cannot generate a Spoonerism.");
            return;
        }
        String firstConsonants = firstWord.substring(0, vowelIndexFirst);
        String firstRest = firstWord.substring(vowelIndexFirst);

        String secondConsonants = secondWord.substring(0, vowelIndexSecond);
        String secondRest = secondWord.substring(vowelIndexSecond);

        String newFirstWord = secondConsonants + firstRest;
        String newSecondWord = firstConsonants + secondRest;

        System.out.println("The Words: " + firstWord + " and " + secondWord+" Spoonerized are "+ newFirstWord+" "+newSecondWord);
        
    }
}
