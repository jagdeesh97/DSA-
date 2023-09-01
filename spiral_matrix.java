import java.util.Scanner;

public class spiral_matrix {
    public static void printSpiral(int r, int c, int mat[][])
    {
        int left=0;
        int right=c-1;
        int top=0;
        int bottom=r-1;
        while(left<=right && top<=bottom)
        {
            for(int i=left; i<=right; i++)
            {
                System.out.print(mat[top][i]+" ");
            }
            top++;

            for(int i=top; i<=bottom; i++)
            {
                System.out.print(mat[i][right]+" ");
            }
            right--;

            if(top<=bottom){
                for(int i=right; i>=left; i--)
                {
                    System.out.print(mat[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--)
                {
                   System.out.print(mat[i][left]+" ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        printSpiral(r,c,mat);
    }
}
