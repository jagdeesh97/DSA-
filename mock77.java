import java.util.Scanner;

public class mock77 {
    Node head;
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
        while(ptr.next!=null)
        {
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
    public static void main(String[] args) {
        mock77 obj=new mock77();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            obj.addList(sc.nextInt());
        }

        obj.printList();

    }
}
