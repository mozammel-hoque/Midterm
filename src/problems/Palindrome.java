package problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        //implementation here...
        String k = "KAYAK";
        if (isPalindrome(k)) {
            System.out.println("\""+k+"\" is Palindrome");
        }
        else {
            System.out.println("\""+k+"\" is not palindrome");
        }

    }

    public static boolean isPalindrome(String string) {

        String word = string;
        StringBuilder palindrome = new StringBuilder();
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++) {
            palindrome.append(word.charAt(wordLength - 1 - i));
        }
        String revPalindrome = new String(palindrome);

        if (word.matches(revPalindrome)) return true;
        else return false;
    }
}