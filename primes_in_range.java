import java.util.Scanner;

public class primes_in_range{
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a; i<=b; i++)
        {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
