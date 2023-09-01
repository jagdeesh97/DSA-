import java.util.Scanner;

public class boundaryTraversal {

    public static void printBoundary(int arr[][], int n, int m) {

       for(int i=0; i<m; i++){
           System.out.print(arr[0][i]+" ");   // first row
       }

       for(int i=1; i<n; i++){
           System.out.print(arr[i][m-1]+" ");  // last column
       }

       if(n>1){  // if you have only one row
           for(int i=m-2; i>=0; i--){
               System.out.print(arr[n-1][i]+" ");  // last row
           }
       }

      if(m>1){   // if you have only one column
          for(int i=n-2; i>0; i--){
              System.out.print(arr[i][0]+" ");  // first column
          }
      }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j]=sc.nextInt();
            }
        }
      printBoundary(mat,n,m);

    }
}
