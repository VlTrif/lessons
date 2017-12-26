package lesson3;

import java.util.Scanner;

public class Input {
    private double inputFirst;
    private double inputSecond;
    private char inputAction;

    public double getInputFirst() {
        return inputFirst;
    }

    public double getInputSecond() {
        return inputSecond;
    }

    public char getInputAction() {
        return inputAction;
    }

    private void setFirst(double inputFirst) {
        this.inputFirst = inputFirst;
    }

    private double inputFirst(Scanner scanner){
        setFirst(scanner.nextDouble());
        return inputFirst;
    }

    private void setSecond(double inputSecond) {
        this.inputSecond = inputSecond;
    }

    private double inputSecond(Scanner scanner){
        setSecond(scanner.nextDouble());
        return inputSecond;
    }

    private void setInputAction(char inputAction) {
        this.inputAction = inputAction;
    }

    private char inputAction(Scanner scanner){
        setInputAction(scanner.next().charAt(0));
        return inputAction;
    }

    public Input inputValues(Scanner scanner) {
        System.out.print("Enter first number: ");
        inputFirst(scanner);
        System.out.print("Enter second number: ");
        inputSecond(scanner);
        System.out.print("Enter the operation: ");
        inputAction(scanner);
        return this;
    }

}
