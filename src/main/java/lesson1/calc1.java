package lesson1;

import java.util.Scanner;

public class calc1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("lesson3.Input first number : ");
        float a = scan.nextFloat(); // Ввод первого числа

        System.out.print("lesson3.Input second number : ");
        float b = scan.nextFloat(); // Ввод второго числа

        String operator;
        System.out.print("Enter the operation: ");
        operator = scan.next(); // Считывание оператора

        if (operator.equals("*")) {
            System.out.print("Multiplication = ");
            System.out.printf("%.4f", (a * b));
        }
        if (operator.equals("/")) {
            System.out.print("Division = ");
            System.out.printf("%.4f", (a / b));
        }
        if (operator.equals("+")) {
            System.out.print("Addition = ");
            System.out.printf("%.4f", (a + b));
        }
        if (operator.equals("-")) {
            System.out.print("Subtraction = ");
            System.out.printf("%.4f", (a - b));
        }
    }
}
