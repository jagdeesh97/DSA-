import java.util.Scanner;

public class MaxContSubArraySum {      //THIS IS KADANE ALGORITHM
    public  static  void maxSum(int arr[], int n)
    {
      int contSum=0;
      int index=0;
      int finalSum=Integer.MIN_VALUE;
      for(int i=0; i<n; i++)
      {
          contSum=arr[i]+contSum; //HERE PREFIX SUM IS CONTSUM
          if(finalSum<contSum)
              finalSum=contSum;
          if(contSum<0)
              contSum=0;
      }
      System.out.print(finalSum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        maxSum(arr,n);
    }
}
