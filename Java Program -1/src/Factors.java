import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 2;num>1;i++){
              if(num%i==0){
                  while(num%i==0){
                      System.out.println(i);
                      num = num/i;
                  }
              }
        }
    }
}
