package jenniferAssignment;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        int tripledFirstNumber = firstNumber * 3;
        int doubledSecondNumber = secondNumber * 2;

        boolean isMultiple = tripledFirstNumber % doubledSecondNumber == 0;

        System.out.printf("Is %d tripled a multiple of %d doubled? %b%n", firstNumber, secondNumber, isMultiple);

    }
}

