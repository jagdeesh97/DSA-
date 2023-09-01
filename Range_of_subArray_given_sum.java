import java.util.Scanner;

public class Range_of_subArray_given_sum {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i]=sc.nextInt();
            }

            for(int i=0; i<n; i++)
            {
                int currSum=arr[i];
                if(currSum==sum)
                {
                    System.out.print((i+1)+" "+(i+1));
                    return;
                }
                else
                {
                    for(int j=i+1; j<n; j++)
                    {
                        currSum +=arr[j];
                        if(currSum==sum){
                            System.out.print((i+1)+" "+(j+1));
                            return;
                        }
                    }
                }
            }
            System.out.print(-1);
        }
    }

