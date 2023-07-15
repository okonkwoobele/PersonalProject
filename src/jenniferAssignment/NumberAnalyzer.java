package jenniferAssignment;

    import java.util.Scanner;

    public class NumberAnalyzer {
        public static void main(String[] args) {
            // Input information
            Scanner scanner = new Scanner(System.in);
            int negativeCount = 0;
            int positiveCount = 0;
            int zeroCount = 0;

            // Input five numbers
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter number " + i + ": ");
                int number = scanner.nextInt();

                if (number < 0) {
                    negativeCount++;
                } else if (number > 0) {
                    positiveCount++;
                } else {
                    zeroCount++;
                }
            }

            // Output the results
            System.out.println("Number of negative numbers: " + negativeCount);
            System.out.println("Number of positive numbers: " + positiveCount);
            System.out.println("Number of zeros: " + zeroCount);

        }
    }

}
