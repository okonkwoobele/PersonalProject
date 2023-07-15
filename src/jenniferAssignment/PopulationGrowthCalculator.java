package jenniferAssignment;

    import java.util.Scanner;

    public class PopulationGrowthCalculator {
        public static void main(String[] args) {
            // Input information
            Scanner scanner = new Scanner(System.in);
            System.out.print("Current world population: ");
            long currentPopulation = scanner.nextLong();
            System.out.print("Annual population growth rate (in percentage): ");
            double growthRate = scanner.nextDouble();

            // Calculate population growth
            double populationGrowth = currentPopulation * (growthRate / 100);

            // Output the result
            System.out.println("Annual population growth: " + populationGrowth);

            scanner.close();
        }
    }

}
