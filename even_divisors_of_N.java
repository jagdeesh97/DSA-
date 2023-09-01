import java.util.Scanner;

public class even_divisors_of_N {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=1; i<=Math.sqrt(n); i++)
            {
                if(n%i==0)
                {
                    if(i==n/i && i%2==0)
                    {
                        System.out.print(i+" ");
                    }
                    else
                    {
                        if(i%2==0) {
                            System.out.print(i +" ");
                        }
                        if((n/i)%2==0) {
                            System.out.print(n/i +" ");
                        }

                    }
                }
            }
        }
    }


