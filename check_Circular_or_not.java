import java.util.Scanner;
public class check_Circular_or_not {
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
        while (ptr.next!=null){
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
    public void checkCircular(Node head){
        Node ptr=head.next;
        while (ptr!=null && ptr!=head){
            ptr=ptr.next;
        }
        if(ptr==head){
            System.out.print("List is circular");
        }
        else {
            System.out.print("List is not circular");
        }
    }
    public static void main(String[] args) {
        check_Circular_or_not obj=new check_Circular_or_not();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0; i<n; i++)
        {
            obj.addList(sc.nextInt());
        }
        obj.printList();
        System.out.println();

        obj.checkCircular(head);
    }
}
