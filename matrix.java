import java.util.Scanner;

public class matrix {
    public static void do_swap(int matrix[][],int x1,int x2,int position1,int position2)
    {
        int flag=matrix[x1][x2];
        matrix[x1][x2]=matrix[position1][position2];
        matrix[position1][position2]=flag;
    }
    public static void new_matrix(int matrix[][],int m,int n)//[[3,3,1,1],[2,2,1,2],[1,1,1,2]]
    {
        int same;
        int position;
        for(int i=0; i<m; i++)
        {
           same=matrix[i][i];
           position=i;

            for(int j=i+1; j<n; j++)
            {
                if(same>matrix[j][j])
                {
                    same= matrix[j][j];
                    position=j;
                }
            }
            do_swap(matrix,i,i,position,position);
        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        new_matrix(matrix,m,n);

    }
}
