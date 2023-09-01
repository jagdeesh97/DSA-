import java.util.Scanner;

public class Rotate_matrix_element_Clockwise {
    public static void rotate_matrix(int mat[][], int m,int n)
    {
        int row=0;
        int col=0;
        int curr,prev;

        while(row<m && col<n)
        {
            if(row+1==m || col+1==n)
                break;

            prev=mat[row+1][col];

            for(int i=col; i<n; i++)
            {
                curr=mat[row][i];
                mat[row][i]=prev;
                prev=curr;
            }
            row++;

            for(int i=row; i<m; i++)
            {
                curr=mat[i][n-1];
                mat[i][n-1]=prev;
                prev=curr;
            }
            n--;
            if(row<m)
            {
                for(int i=n-1; i>=col; i--)
                {
                    curr = mat[m-1][i];
                    mat[m-1][i] = prev;
                    prev = curr;
                }
            }
            m--;

            if (col < n)
            {
                for (int i = m-1; i >= row; i--)
                {
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        rotate_matrix(mat,m,n);
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
