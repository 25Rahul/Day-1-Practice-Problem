import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        float harmonic = 1;
        for(int i = 2;i<=num;i++){
             harmonic +=(float)1/i;
        }
        System.out.println(harmonic);
    }
}
