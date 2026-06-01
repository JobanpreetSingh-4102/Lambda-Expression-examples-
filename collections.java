package main.java;

import java.util.Arrays;
import java.util.List;

//public class collections {
//    public static void main(String[] args) {
//
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//    }
//}





public class collections {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(name -> System.out.println(name));
    }
}