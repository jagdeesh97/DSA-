import java.util.Scanner;

public class find_kth_node_fromEnd {
    static Node head;
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
        while (ptr.next!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print(ptr.data);
    }

    public void deleteKthNode(Node head, int k){
        Node ptr1=head;
        Node ptr2=head;
        int count=0;
        if(head==null){
            System.out.print("List is empty ");
            return;
        }
        while (count<k)
        {
            if(ptr2==null){
                System.out.print("Element is lesser than k");
                return;
            }
            ptr2=ptr2.next;
            count++;
        }
        while (ptr2!=null)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        System.out.print(ptr1.data);
    }
    public static void main(String[] args) {
        find_kth_node_fromEnd obj=new find_kth_node_fromEnd();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            obj.addList(sc.nextInt());
        }
        int k=sc.nextInt();
        obj.printList();
        System.out.println();

        obj.deleteKthNode(head,k);
    }
}
