import java.util.Scanner;
import java.util.*;

public class Palinrome {
   static Node head;
   static Node head1;
    public class Node{
        int data;
        Node next;
        int length;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public  void addList(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
           return;
        }
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
    }
    public  void  printList(){
        if(head==null){
            System.out.println("null");
            return;
        }
        Node ptr=head;
        while (ptr!=null){
            System.out.print(ptr.data+"->");   // 1 2 3 2 1
            ptr=ptr.next;
        }
        System.out.print("null");
    }
    public void reverse(Node head1){
        if(head1==null || head1.next==null){
            return;
        }
        Node prevNode=head1;
        Node currNode=head1.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode; // updating
            currNode=nextNode; //updating
        }
        head1.next=null;
        head1=prevNode;

    }
    public void  checkPalindrome(Node head){
        Node ptr=head;
        Node ptr1=head1;
      while(ptr.next!=null){
          if(ptr.data!=ptr1.data){
              System.out.print("Not palindrome");
              return;
          }
          ptr=ptr.next;
          ptr1=ptr1.next;
      }
      System.out.print("List is palindrome");
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Palinrome obj=new Palinrome();
        for(int i=0; i<n; i++)
        {
            obj.addList(sc.nextInt());
        }
        obj.printList();
        System.out.println();

        obj.reverse(head);
        obj.checkPalindrome(head);
    }
}
