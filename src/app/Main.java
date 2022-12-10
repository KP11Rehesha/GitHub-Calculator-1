package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My git app. Super!");

        int a = 8;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int x = subtraction(a, b);
        System.out.println(x);
        int y = division(a, b);
        System.out.println(y);
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