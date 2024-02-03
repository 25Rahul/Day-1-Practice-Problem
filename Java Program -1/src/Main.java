import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        if (numFlips<= 0){
            System.out.println("Please enter a positive integer for the number of coin flips.");
            return;
        }

        int headCount = 0;
        int tailCount =0;

        for (int i=0;i<numFlips;i++){
            if(Math.random() < 0.5){
                headCount++;
            }
            else{
                tailCount++;
            }
        }

        double headsPercentage = (headCount * 100.0) / numFlips;
        double tailsPercentage =  (tailCount * 100.0) / numFlips;

        System.out.printf("Heads: %.2f%%%n", headsPercentage);
        System.out.printf("Tails: %.2f%%%n", tailsPercentage);

    }
}