package main.java;

import java.util.Arrays;
import java.util.List;

public class API {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        numbers.stream()
                .filter(n -> n % 2 == 0) // keep even numbers
                .map(n -> n * 2)         // double them
                .forEach(System.out::println); // print
    }
}