import java.util.Scanner;

public class trailing_zeros {
    public static void main(String[] args) {   // Find no of trailing zeros in factorial of a number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<5) {
            System.out.print(0);
            return;
        }
        int count=0;
        while(n > 4){
            n = n / 5;
            count = count + n;
        }
        System.out.print(count);
    }
}
