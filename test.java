import java.util.Scanner;
public class test {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int D=sc.nextInt();
        for(int i=1; i<=N; i++)
        {    int count=0;
            while(i>0)
            {
                i=i%10;

                if(i==D)
                {
                    count++;
                }
                i=i/10;
            }
            if(count>0){
                System.out.print(i);
            }
        }
    }

}
