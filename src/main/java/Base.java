import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        input.inputValues(scanner);
        scanner.close();

        Mathematic m = new Mathematic(input.getInputFirst(),input.getInputSecond(), input.getInputAction());
        System.out.print("Result: " + m.response());


    }
}
