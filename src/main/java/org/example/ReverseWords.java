package org.example;

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        String[] reversedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = new StringBuilder(words[i]).reverse().toString();
        };

        return original.trim().isEmpty() ? original : String.join(" ", reversedWords);
    }
}
