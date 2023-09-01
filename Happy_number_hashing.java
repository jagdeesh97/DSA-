import java.util.HashMap;
import java.util.Scanner;

public class Happy_number_hashing {
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
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(n!=1 && !hm.containsKey(n))
        {
            hm.put(n,1);
            n=changeNumber(n);
        }
        System.out.print(n==1);  // if n(1)==1 -> true else false
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isHappyNumber(n);
    }
}
