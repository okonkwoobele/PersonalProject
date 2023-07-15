package jenniferAssignment;
import java.util.Scanner;

public class PollingProgram {
    public static void main(String[] args) {
        // Initialize the topics array
        String[] topics = {"Political Issues", "Global Environmental Issues", "Education Reform",
                "Social Equality", "Healthcare Access"};

        // Initialize the responses array
        int[][] responses = new int[5][10];

        // Prompt the user to rate each issue
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Rate the importance of %s from 1 (least important) to 10 (most important):\n",
                    topics[i]);
            for (int j = 0; j < 10; j++) {
                while (true) {
                    try {
                        System.out.printf("Rating %d: ", j + 1);
                        int rating = scanner.nextInt();
                        if (rating < 1 || rating > 10) {
                            throw new IllegalArgumentException();
                        }
                        responses[i][rating - 1]++;
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid rating. Please enter a number between 1 and 10.");
                        scanner.nextLine(); // Clear the input buffer
                    }
                }
            }
        }

        // Display the tabular report
        System.out.println("\n----- Polling Results -----\n");
        System.out.printf("%-30s%s\n", "Topic", "Ratings");
        System.out.println("-".repeat(40));
        for (int i = 0; i < 5; i++) {
            int totalRatings = 0;
            double averageRating = 0.0;
            for (int j = 0; j < 10; j++) {
                totalRatings += responses[i][j];
                averageRating += (j + 1) * responses[i][j];
                System.out.printf("%d ", responses[i][j]);
            }
            averageRating /= totalRatings;
            System.out.printf("  %.2f\n", averageRating);
        }

        // Find the issue with the highest and lowest point totals
        int highestTotal = Integer.MIN_VALUE;
        int lowestTotal = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 10; j++) {
                total += responses[i][j];
            }
            if (total > highestTotal) {
                highestTotal = total;
            }
            if (total < lowestTotal) {
                lowestTotal = total;
            }
        }

        System.out.println("\nIssue with the highest point total:");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 10; j++) {
                total += responses[i][j];
            }
            if (total == highestTotal) {
                System.out.printf("%s (Total: %d)\n", topics[i], highestTotal);
            }
        }

        System.out.println("\nIssue with the lowest point total:");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 10; j++) {
                total += responses[i][j];
            }
            if (total == lowestTotal) {
                System.out.printf("%s (Total: %d)\n", topics[i], lowestTotal);
            }
        }
    }
}
