package main.java;

/// before lambda expression
//interface Greeting {
//    void sayHello();
//}
//
//public class parameters {
//    public static void main(String[] args) {
//
//        Greeting g = new Greeting() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello World");
//            }
//        };
//
//        g.sayHello();
//    }
//}
/// no parameter
/// after lambda expression
//interface Greeting {
//    void sayHello();
//}
//
//public class parameters {
//    public static void main(String[] args) {
//
//        Greeting g = () -> System.out.println("Hello World");
//
//        g.sayHello();
//    }
//}






///// single parameter
//interface Square {
//    int calculate(int x);
//}
//
//public class parameters {
//    public static void main(String[] args) {
//        Square s = x -> x * x;
//
//        System.out.println("Square of 5: " + s.calculate(5));
//    }
//}
///// another
//import java.util.function.Predicate;
//
//public class parameters {
//    public static void main(String[] args) {
//        Predicate<Integer> isEven = n -> n % 2 == 0;
//
//        System.out.println("Is 10 even? " + isEven.test(10));
//        System.out.println("Is 7 even? " + isEven.test(7));
//    }
//}







/////multiple paramters
//interface Add {
//    int sum(int a, int b);
//}
//
//public class parameters {
//    public static void main(String[] args) {
//        Add add = (a, b) -> a + b;
//
//        System.out.println("Sum: " + add.sum(10, 20));
//    }
         /* another */
import java.util.function.BiFunction;

public class parameters {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> max =
                (a, b) -> (a > b) ? a : b;

        System.out.println("Max: " + max.apply(15, 25));
    }
}