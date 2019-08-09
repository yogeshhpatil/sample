package com.sample.app.problemSolving;

import java.util.ArrayList;
import java.util.List;

public class IsStringPallindromable {
    /**
     * Let's say you are given a string.
     * You can get many strings (combination) out of the given original string
     * if you rearrange characters of original string.
     * <p>
     * String is Palindromable if any one combination is palindrome.
     * <p>
     * Example 1:
     * <p>
     * Original String: NINIT
     * <p>
     * Combinations: NINIT, NNIIT,IINNT,ININT,IITNN,NITIN,INTIN,INTNI,NTNII,NNTII and so on
     * <p>
     * Original string is  Palindromable because two palindrome can be made out of it.
     * <p>
     * Example 2:
     * <p>
     * Original String: NINNIT
     * <p>
     * Combinations: NINITN, NNINIT,IINNNT,INNINT,INITNN,NNITIN,INTNIN,INTNIN,NTNINI,NNTINI and so on
     * <p>
     * Original string is NOT Palindromable because NO palindrome can be made out of it.
     * <p>
     * Question:
     * <p>
     * Write a program to check it given string is Palindromable or not.
     * (please note this is not a question to check if string is palindrome or not).
     */
    public static boolean isPallindromable(String input) {
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (characters.contains(input.charAt(i)))
                characters.remove(Character.valueOf(input.charAt(i)));
            else
                characters.add(input.charAt(i));
        }

        if (characters.size() <= 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPallindromable("NINIT"));
        System.out.println(isPallindromable("NINNIT"));
    }
}