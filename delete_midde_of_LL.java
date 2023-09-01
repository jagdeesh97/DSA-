import java.util.Scanner;
import java.util.*;
public class delete_midde_of_LL {
       static Node head;
        public class Node{
            int data;
            Node next;
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
            while (ptr.next!=null){
                System.out.print(ptr.data+"->");
                ptr=ptr.next;
            }
            System.out.print(ptr.data);
        }
      public static void  deleteMiddle(Node head){
            if(head==null || head.next==null){
                System.out.print("null");
                return;
            }
         Node slow=head;
         Node fast=head;
         Node prev=null;
         while(fast!=null && fast.next!=null){
             fast=fast.next.next;
             prev=slow;
             slow=slow.next;
         }
         prev.next=slow.next;
      }

        public static void main(String[] args){

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            delete_midde_of_LL obj=new delete_midde_of_LL();
            for(int i=0 ;i<n; i++)
            {
                obj.addList(sc.nextInt());
            }
            obj.printList();
            System.out.println();

            deleteMiddle(head);
            System.out.println();
            obj.printList();
        }

}
