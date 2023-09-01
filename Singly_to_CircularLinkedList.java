import java.util.Scanner;

public class Singly_to_CircularLinkedList {
    static  Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
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
    }
    public void printList(){
        if(head==null){
            System.out.print("null");
            return;
        }
        Node ptr=head;
        while(ptr.next!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print(ptr.data);
    }
    public void makeCircular(Node head){
        Node ptr=head;
        while (ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=head;
    }
    public void printCircularList(){
        if(head==null){
            System.out.print("null");
            return;
        }
        Node ptr=head;
        while(ptr.next!=head){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print(ptr.data+"->");
        System.out.print(head.data);  // or System.out.print(ptr.next.data);
    }
    public static void main(String[] args) {
        Singly_to_CircularLinkedList obj=new Singly_to_CircularLinkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            obj.addList(sc.nextInt());
        }
        obj.printList();
        System.out.println();

        obj.makeCircular(head);
        obj.printCircularList();
    }
}
