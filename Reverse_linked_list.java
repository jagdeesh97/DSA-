import java.util.Scanner;
public class Reverse_linked_list {
    Node head;
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
    public void  reverse(){   // time O(n)   Space  O(1)
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode; // updating
            currNode=nextNode; //updating
        }
        head.next=null;
        head=prevNode;

    }
    public  Node  reverseRecursive(Node head){  // time complexity is O(n)
        if(head==null || head.next==null){      // Space complexity is O(n) to store recursive call
            return head;
        }                                          //  1->2->3->4
        Node newHead = reverseRecursive(head.next); // 1 2<-3<-4
        head.next.next=head;                        // 1<-2<-3<-4
        head.next=null;                             // null <- 1<-2<-3<-4
        return newHead;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Reverse_linked_list obj=new Reverse_linked_list();
        for(int i=0 ;i<n; i++)
        {
            obj.addList(sc.nextInt());
        }
        obj.printList();

        obj.reverse();
        System.out.println();
        obj.printList();

        obj.head=obj.reverseRecursive(obj.head);
        System.out.println();
        obj.printList();
    }

}
