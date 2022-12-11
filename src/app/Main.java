package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Super app!");
        System.out.println("Calculator for base calculations");
        int a = 8;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
