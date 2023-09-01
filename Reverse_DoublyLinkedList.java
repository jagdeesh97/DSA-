import java.util.Scanner;
public class Reverse_DoublyLinkedList {
    static Node head;
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }
    public void addList(int data){
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
        newNode.prev=ptr;
    }
    public void printList(){
        if(head==null){
            System.out.print("null");
            return;
        }
        Node ptr=head;
        while (ptr.next!=null){
            System.out.print(ptr.data+"<->");
            ptr=ptr.next;
        }
        System.out.print(ptr.data);
    }
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        head.prev=head.next;  // extra compare to singly linked list
        return newHead;
    }
    public static void main(String[] args) {
        Reverse_DoublyLinkedList obj=new Reverse_DoublyLinkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            obj.addList(sc.nextInt());
        }
        obj.printList();
        System.out.println();

        obj.head=obj.reverseRecursive(obj.head);
        obj.printList();
        System.out.println();

    }
}
