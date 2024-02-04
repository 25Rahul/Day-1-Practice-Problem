import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Printing all till Power Value "+num);

        for(int i=1;i<=num;i++)
        {
            System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));
        }

    }

}
