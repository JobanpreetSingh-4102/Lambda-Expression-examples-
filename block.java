package main.java;

@FunctionalInterface
interface Factorial {
    int calculate(int n);
}

public class block {
    public static void main(String[] args) {

        Factorial fact = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = result * i;
            }

            return result;
        };

        System.out.println("Factorial of 5 = " + fact.calculate(5));
    }
}