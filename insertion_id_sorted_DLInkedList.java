import java.util.Scanner;

public class insertion_id_sorted_DLInkedList {//Given a sorted doubly linked list insert a node in that linked list so that after adding
    static Node head;                   // the list  should be sorted.
    static int size=0;         // input  1 3 4 5 6 8 9 10   k==7(adding element)
    public class Node{        // output  1 3 4 5 6 7 8 9 10
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
            size++;
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
            System.out.print("List is empty");
            return;
        }
        Node ptr=head;
        System.out.print("null<-");
        while (ptr.next!=null){
            System.out.print(ptr.data+"<->");
            ptr=ptr.next;
        }
        System.out.print(ptr.data);
        System.out.print("->null");
    }
    public int getSize(){
        return size;
    }
    public void insertNode(Node head, int k){
        Node newNode=new Node(k);
        if(head==null){
            head=newNode;
            return;
        }
        Node ptr=head;
        Node behind=null;
        while (ptr!=null){
            if(ptr.data < k){
                behind=ptr;
                ptr = ptr.next;

            }
            else{
                break;
            }
        }
        if(ptr==head)           // insert at start of linked list
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            return;
        }
       if(ptr!=null)         // insert in middle  (insert behind of ptr)
       {
           newNode.next=ptr;
           newNode.prev=ptr.prev;
           ptr.prev=newNode;
           newNode.prev.next=newNode;
           return;
       }
       else                // insert at last
       {
         behind.next=newNode;
         newNode.prev=behind;
       }
    }

    public static void main(String[] args) {
        insertion_id_sorted_DLInkedList obj=new insertion_id_sorted_DLInkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            obj.addList(sc.nextInt());
        }
        int k=sc.nextInt();
        obj.printList();
        System.out.println();
        System.out.println("size of list is = "+obj.getSize());

        obj.insertNode(head,k);
        obj.printList();
        System.out.println();
        System.out.println("size of list is = "+obj.getSize());

    }
}
