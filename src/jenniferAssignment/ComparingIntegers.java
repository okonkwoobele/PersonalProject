package jenniferAssignment;
import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int square = number * number;

        if (number > 100) {
            System.out.println(number + " is greater than 100.");
        } else if (number < 100) {
            System.out.println(number + " is less than 100.");
        } else {
            System.out.println(number + " is equal to 100.");
        }

        if (square > 100) {
            System.out.println("The square of " + number + " is greater than 100.");
        } else if (square < 100) {
            System.out.println("The square of " + number + " is less than 100.");
        } else {
            System.out.println("The square of " + number + " is equal to 100.");
        }

    }
}

