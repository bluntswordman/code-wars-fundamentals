package org.example;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) return 0;

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;

            sum += number;
        }

        return sum - min - max;
    }
}
