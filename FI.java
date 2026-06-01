package main.java;

//@FunctionalInterface
//interface Calculator {
//    int calculate(int a, int b);
//}
//
//public class FI {
//    public static void main(String[] args) {
//
//        // Lambda expression for addition
//        Calculator add = (a, b) -> a + b;
//
//        // Lambda expression for multiplication
//        Calculator multiply = (a, b) -> a * b;
//
//        System.out.println("Addition: " + add.calculate(10, 5));
//        System.out.println("Multiplication: " + multiply.calculate(10, 5));
//    }
//}



//import java.util.function.Predicate;
//
//public class FI {
//    public static void main(String[] args) {
//
//        Predicate<Integer> isEven = n -> n % 2 == 0;
//
//        System.out.println("10 is even: " + isEven.test(10));
//        System.out.println("7 is even: " + isEven.test(7));
//    }
//}


//import java.util.function.Function;
//
//public class FI {
//    public static void main(String[] args) {
//
//        Function<Integer, Integer> square = n -> n * n;
//
//        System.out.println("Square of 5: " + square.apply(5));
//        System.out.println("Square of 8: " + square.apply(8));
//    }
//}



//import java.util.function.Consumer;
//
//public class FI {
//    public static void main(String[] args) {
//
//        Consumer<String> welcome =
//                name -> System.out.println("Welcome " + name);
//
//        welcome.accept("John");
//        welcome.accept("Alice");
//    }
//}



//import java.util.function.Supplier;
//
//public class FI {
//    public static void main(String[] args) {
//
//        Supplier<Double> randomNumber = () -> Math.random();
//
//        System.out.println("Random Number: " + randomNumber.get());
//        System.out.println("Random Number: " + randomNumber.get());
//    }
//}