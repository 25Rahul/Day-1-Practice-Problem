import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Dividend:");
        int divdend = scanner.nextInt();
        System.out.println("Enter the Divisor:");
        int divisor = scanner.nextInt();
        int quotient = divdend / divisor;
        int remainder = divdend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
