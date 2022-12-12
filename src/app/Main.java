package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");

        MyNumbers numbers = declaration();

        int c = add(numbers.a, numbers.b);
        System.out.println(numbers.a + "+" + numbers.b + "=" + c);
        int d = multiply(numbers.a, numbers.b);
        System.out.println(numbers.a + "*" + numbers.b + "=" + d);
        int x = subtraction(numbers.a, numbers.b);
        System.out.println(numbers.a + "-" + numbers.b + "=" + x);
        int y = division(numbers.a, numbers.b);
        System.out.println(numbers.a + "/" + numbers.b + "=" + y);
    }

    private static MyNumbers declaration() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        scanner.close();
        return new MyNumbers(a, b);
    }

    final static class MyNumbers {
        private final int a;
        private final int b;

        public MyNumbers(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int division(int a, int b) {
        return a / b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }
}