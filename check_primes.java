import java.util.Scanner;

public class check_primes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2){
            System.out.print("Number is not a prime");
            return;
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                System.out.print("Number is not prime");
                return;
            }
        }
        System.out.print("Number is prime");
    }
}
