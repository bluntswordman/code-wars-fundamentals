package org.example;

public class CenturyFromYear {
    public static int century(int number) {
        return (int) Math.floor((double) (number + 99) / 100);
    }
}
