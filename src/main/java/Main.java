import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        System.out.println("Welcome to the calculator\nEnter a command:\n");
        boolean quit = false;
        while (!quit) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            String[] tokens = input.split(" ");
            switch (tokens[0]) {
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(tokens[1])));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(tokens[1])));
                    break;
                default:
                    System.out.println("Exiting.\n");
                    quit = true;
            }
        }
    }
}
