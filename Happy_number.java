import java.util.Scanner;

public class Happy_number {
    static int changeNumber(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum + r*r;
            n=n/10;
        }
        return sum;
    }
    public  static void isHappyNumber(int n)  // 19 is a happy number  // 20 is not happy number
    {
        int original=n;
        while(n!=1){
            n=changeNumber(n);
            if(n==original){
                System.out.print(false);
                return;
            }
        }
        System.out.print(true);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isHappyNumber(n);
    }
}
