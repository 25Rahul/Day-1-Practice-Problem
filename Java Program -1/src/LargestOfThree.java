import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second Number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third Number:");
        int num3 = scanner.nextInt();
        if(num1<num2 && num2>num3){
            System.out.println(num2+" is the largest of the three given numbers.");
        }
        else if (num1>num2 && num1>num3){
            System.out.println(num1+" is the largest of the three given numbers.");
        }
        else{
            System.out.println(num3+" is the largest of the three given numbers.");
        }
    }

}
