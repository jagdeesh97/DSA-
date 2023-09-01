import java.util.LinkedList;
import java.util.*;

public class detect_loop_in_LinkedList {
    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int data)
        {
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
    public void detectLoop(Node head){

        HashSet<Node> s = new HashSet<Node>();
        while(head!=null)
        {
            if(s.contains(head)){
                System.out.print("Loop is found");
                return;
            }
            s.add(head);
            head=head.next;
        }
        System.out.print("Loop is not found");
    }
    public static void main(String[] args) {
        detect_loop_in_LinkedList obj=new detect_loop_in_LinkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            obj.addList(sc.nextInt());
        }
        obj.printList();
        System.out.println();
        /*Create loop for testing */
        obj.head.next.next.next.next = obj.head;

        obj.detectLoop(head);
    }
}
