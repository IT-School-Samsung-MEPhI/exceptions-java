package example5;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        exampleMethod1();

        System.out.println();

        int a = exampleMethod2();
        System.out.println("exampleMethod2 returned " + a);

        System.out.println();

        int b = exampleMethod3();
        System.out.println("exampleMethod3 returned " + b);

        System.out.println();

        int c = exampleMethod4();
        System.out.println("exampleMethod4 returned " + c);

        System.out.println();

        int d = exampleMethod5();
        System.out.println("exampleMethod5 returned " + d);
    }

    private static void exampleMethod1() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        a = scanner.nextInt();
        System.out.print("Input b: ");
        b = scanner.nextInt();
        try {
            System.out.println("Division result: " + (a / b));
        } catch (Exception e) {
            System.out.println("Can't divide by zero!");
        } finally {
            System.out.println("Program finished");
        }
    }

    private static int exampleMethod2() {
        try {
            return 1;
        } finally {
            System.out.println("Finally block executed");
        }
    }

    private static int exampleMethod3() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("Finally block executed");
        }
    }

    private static int exampleMethod4() {
        try {
            return 3;
        } finally {
            return 4;
        }
    }

    private static int exampleMethod5() {
        try {
            return 1;
        } finally {
            throw new RuntimeException();
        }
    }
}
