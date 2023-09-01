import java.util.Scanner;
                          //  find no of one in binary sorted array in logarithmic time
public class no_of_One {  // input== 0 0 0 0 0 1 1 1 1 1 1  output==6  Complexity log(n)
    public static int findNoOfOnes(int arr[], int l,int r)
    {
        if(arr[l]==1)
        {
            return r-l+1;
        }
        if(arr[r]==0)
        {
            return 0;
        }
        int mid=l+(r-l)/2;
        return findNoOfOnes(arr,l,mid) + findNoOfOnes(arr,mid+1,r);
    }
    public static void main(String[] args) {  // time complexity should be O(log(n))

          Scanner sc=new Scanner(System.in);  // input   0000000111111111   output=9
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0; i<n; i++)
          {
              arr[i]=sc.nextInt();
          }

          System.out.println(findNoOfOnes(arr,0,n-1));
    }

}
