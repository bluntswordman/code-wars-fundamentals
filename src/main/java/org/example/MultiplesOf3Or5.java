package org.example;

import java.util.stream.IntStream;

public class MultiplesOf3Or5 {
    public int solution(int number) {
        //TODO: Code stuff here
        return IntStream.range(3, number).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
    }
}
