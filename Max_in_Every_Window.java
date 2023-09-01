import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Max_in_Every_Window {      // time complexity is O(n)   // Space complexity is O(k)
    public  static  void maxInEachSubArraySizeK(int arr[], int n, int k)
    {
      Deque<Integer> deque=new LinkedList<>();

      for(int i=0; i<k; i++)  // process the first k elements
      {
          while (!deque.isEmpty() && arr[i] > arr[deque.peekLast()])// remove already existing useless element
          {
              deque.removeLast();
          }
          deque.addLast(i);  //addition
      }
      for(int i=k; i<n; i++)
      {
          System.out.print(arr[deque.peekFirst()]+" ");// Previous window max printing

          while(!deque.isEmpty() && deque.peekFirst() <= i-k) // remove non-window element or first element of previous window
          {
              deque.removeFirst();
          }

          while (!deque.isEmpty() && arr[i] > arr[deque.peekLast()])// remove already existing useless element
          {
              deque.removeLast();
          }
          deque.addLast(i);  //addition
      }
        System.out.print(arr[deque.peekFirst()]+" ");  // printing last window max element
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
        maxInEachSubArraySizeK(arr,n,k);

    }
}
