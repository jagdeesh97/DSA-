import java.util.Scanner;

public class Rotate_matrix_Anti_clock {
    public static void rotate_matrix(int mat[][], int n)
    {
        for(int i=0; i<n/2; i++)  // Consider all squares one by one
        {
            for(int j=i; j<n-1-i; j++)  //Consider elements in groups of 4 in current square
            {
                int temp=mat[i][j];  //Store current cell in temp variable

                mat[i][j]=mat[j][n-1-i];  // move values from right to top

                mat[j][n-1-i]=mat[n-1-i][n-1-j];  //move values from bottom to right

                mat[n-1-i][n-1-j]=mat[n-1-j][i];  // move values from left to bottom

                mat[n-1-j][i]=temp;  // Assign temp to left

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        rotate_matrix(mat,n);
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
