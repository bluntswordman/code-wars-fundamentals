package org.example;

public class DecodeTheMorseCodePart1 {
    public static String decode(String morseCode) {
        String[] words = morseCode.trim().split("   ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String[] letters = word.split(" ");
//            for (String letter : letters) {
//                result.append(MorseCode.get(letter));
//            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
