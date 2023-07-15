package jenniferAssignment;

import java.util.Scanner;

    public class DigitSeparator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a five-digit number: ");
            int number = scanner.nextInt();

            int digit1 = number / 10000;  // Extract the first digit
            int digit2 = (number / 1000) % 10;  // Extract the second digit
            int digit3 = (number / 100) % 10;  // Extract the third digit
            int digit4 = (number / 10) % 10;  // Extract the fourth digit
            int digit5 = number % 10;  // Extract the fifth digit

            System.out.printf("%d   %d   %d   %d   %d\n", digit1, digit2, digit3, digit4, digit5);

            scanner.close();
        }
    }

}
