import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Max_in_every_subARraySizeK {
    public  static  void maxInEverySubarrays(int arr[], int n, int k)
    {
        Deque<Integer> dq=new LinkedList<>();

        for(int i=0; i<k; i++)  // first widow
        {
            while (!dq.isEmpty() && arr[i] > dq.peekLast())// remove already existing useless elements
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(int i=k; i<n; i++)
        {
            System.out.print(arr[dq.peekFirst()]+" ");  // previous  (1st) window max element

            while (!dq.isEmpty() && dq.peekFirst() <= i-k)
            {
                dq.removeFirst();
            }

            while (!dq.isEmpty() && arr[i] > dq.peekLast())// remove already existing useless elements
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peekFirst()]+" ");  // printing of last window max element
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        maxInEverySubarrays(arr,n,k);

    }
}
