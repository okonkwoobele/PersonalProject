package jenniferAssignment;
import java.util.Scanner;

public class LargestSmallestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter integer 2: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter integer 3: ");
        int number3 = scanner.nextInt();

        System.out.print("Enter integer 4: ");
        int number4 = scanner.nextInt();

        System.out.print("Enter integer 5: ");
        int number5 = scanner.nextInt();

        int largest = Math.max(Math.max(Math.max(Math.max(number1, number2), number3), number4), number5);
        int smallest = Math.min(Math.min(Math.min(Math.min(number1, number2), number3), number4), number5);

        System.out.println("Largest integer: " + largest);
        System.out.println("Smallest integer: " + smallest);

    }
}

