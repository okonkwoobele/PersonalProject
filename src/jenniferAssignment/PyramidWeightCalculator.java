package jenniferAssignment;



import java.util.Scanner;

public class PyramidWeightCalculator {
    public static void main(String[] args) {
        // Input information
        Scanner scanner = new Scanner(System.in);
        System.out.print("Estimated number of stones used: ");
        int estimatedStonesUsed = scanner.nextInt();
        System.out.print("Average weight of each stone (in kilograms): ");
        double averageWeightOfStone = scanner.nextDouble();
        System.out.print("Number of years taken to build the pyramid: ");
        int yearsTakenToBuild = scanner.nextInt();

        // Calculate total weight of the pyramid
        double totalWeight = estimatedStonesUsed * averageWeightOfStone;

        // Calculate weight built each year
        double weightBuiltPerYear = totalWeight / yearsTakenToBuild;

        // Calculate weight built each hour
        double weightBuiltPerHour = weightBuiltPerYear / (365 * 24);

        // Calculate weight built each minute
        double weightBuiltPerMinute = weightBuiltPerHour / 60;

        // Output the results
        System.out.println("Estimated weight of the pyramid: " + totalWeight + " kilograms");
        System.out.println("Weight built each year: " + weightBuiltPerYear + " kilograms");
        System.out.println("Weight built each hour: " + weightBuiltPerHour + " kilograms");
        System.out.println("Weight built each minute: " + weightBuiltPerMinute + " kilograms");

        scanner.close();
    }
}

