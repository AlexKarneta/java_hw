package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        int[] nums = {5, 8, 12, 3, 17, 4, 9};
        int[] result = Arrays.stream(nums).filter(num -> num > 7).toArray();
        System.out.println("nums > 7 : " + result.length);
        int[] evenArray = IntStream.rangeClosed(1, 20)
                .filter(n -> n % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(evenArray));
    }
}
