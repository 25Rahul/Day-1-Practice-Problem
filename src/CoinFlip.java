import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of coin flips
        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of coin flips.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;

        // Simulating coin flips
        for (int i = 0; i < numFlips; i++) {
            if (Math.random() < 0.5) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Calculating percentages
        double headsPercentage = (headsCount * 100.0) / numFlips;
        double tailsPercentage = (tailsCount * 100.0) / numFlips;

        // Printing results
        System.out.printf("Heads: %.2f%%%n", headsPercentage);
        System.out.printf("Tails: %.2f%%%n", tailsPercentage);
    }
}
