import java.util.Scanner;

public class no_of_digits_in_factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n < 0){
            System.out.print(0);
            return;
        }
        if(n==1){
            System.out.print(1);
            return;
        }

        double digits = 0;

        for(int i=2; i<=n; i++){
            digits +=Math.log10(i);
        }
        System.out.print((int)Math.floor(digits) + 1);
    }
}
