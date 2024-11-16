package example2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println("Value: " + arr[2]);
            System.out.println("Value: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        }

        System.out.println();

        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        a = scanner.nextInt();
        System.out.print("Input b: ");
        b = scanner.nextInt();
        try {
            System.out.println("Division result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }

        System.out.println();

        scanner = null;
        int c = scanner.nextInt();
        System.out.println("Value c: " + c);
    }
}
