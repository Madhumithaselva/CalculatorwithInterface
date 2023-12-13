package se.lexicon;
import java.util.Scanner;

public interface ICalculator {
    int add(int a, int b);

    int sub(int a, int b);

    int mul(int a, int b);

    double div(double a, double b);

    Scanner scanner = new Scanner(System.in);

    static int getUserInputInt(String input) {
        System.out.println(input + " ");
        return scanner.nextInt();
    }

    static double getUserInputDouble(String input) {
        System.out.println(input + " ");
        return scanner.nextDouble();
    }

    default void calculate() {
        int a,b;
        System.out.println("=====Select operation:====");
        System.out.println("1.Addition\n2.Subtrsction\n3.Multiplication\n4.Division");
        int choice = getUserInputInt("Enter your choice:");

        a= getUserInputInt("Enter first number:");
        b = getUserInputInt("Enter second number:");

        switch (choice) {
            case 1:
                System.out.println("Result:" + add(a, b));
                break;
            case 2:
                System.out.println("Result:" + sub(a, b));
                break;
            case 3:
                System.out.println("Result:" + mul(a, b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result:" + div(a, b));
                } else {
                    System.out.println("cannot divide by zero");
                }
                break;
            default:
                System.out.println("Not a valid choice");
                break;
        }

    }
}
