import java.util.Scanner;

public class primemock{
    public  static void isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                System.out.print("The given number is not prime");
                return;
            }
        }
        System.out.print("The given number is prime");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
    }
}
