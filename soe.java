import java.util.Scanner;

public class soe {

    public static  void print_primes_soe(int n) {

        boolean prime[] = new boolean[n+1];

        for (int i=0; i<=n; i++){
            prime[i]=true;
        }

        for(int i=2; i<=n; i++){
            if(prime[i]==true){
                for(int j=i+i; j<=n; j=j+i){
                    prime[j]=false;
                }
            }
        }

        for(int i=2; i<=n; i++) {
            if(prime[i]==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        print_primes_soe(n);
    }
}
