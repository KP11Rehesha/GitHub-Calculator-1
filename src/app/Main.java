package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("My app for users");
        System.out.println("Version 1.0");

        myNumbers numbers = declaration();

        int c = add(numbers.a, numbers.b);
        System.out.println(c);
        int d = multiply(numbers.a, numbers.b);
        System.out.println(d);
        int x = subtraction(numbers.a, numbers.b);
        System.out.println(x);
        int y = division(numbers.a, numbers.b);
        System.out.println(y);
    }
    private static myNumbers declaration(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        scanner.close();
        return new myNumbers(a, b);
    }
    final static class myNumbers {
        private final int a;
        private final int b;

        public myNumbers(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getFirst() {
            return a;
        }

        public int getSecond() {
            return b;
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