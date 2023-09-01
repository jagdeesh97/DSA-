import java.util.Scanner;
import java.util.*;

public class divisors_of_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=Math.sqrt(n); i++)
        {
           if(n%i==0)
           {
               if(i==n/i)
               {
                   System.out.print(i+" ");  //count++
               }
               else
               {
                   System.out.print(i+" "+n/i+" "); // count=count+2
               }
           }
        }
    }
}
