package org.example;

public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            for (char c : str.toCharArray()) {
                if (c == vowel) {
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;
    }
}
