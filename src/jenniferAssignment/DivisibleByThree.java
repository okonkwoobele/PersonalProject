package jenniferAssignment;
import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isDivisibleByThree = number % 3 == 0;

        System.out.printf("Is %d divisible by 3? %b%n", number, isDivisibleByThree);

        scanner.close();
    }
}

