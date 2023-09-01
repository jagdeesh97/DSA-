import java.util.Scanner;

public class pattern_square {                         /*                                         */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j;
        for(int i=0; i<n; i++)
        {
            for( j=0; j<n; j++)                   //  * * * * *
            {                                     //  *       *
                if (i == 0 || i == n - 1) {       //  *       *
                    System.out.print("*  ");      //  *       *
                }                                 //  * * * * *
            }

        }

    }
}
