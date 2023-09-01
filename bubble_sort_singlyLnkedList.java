import java.util.Scanner;

public class bubble_sort_singlyLnkedList {
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
        while(ptr.next!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print(ptr.data);
    }
    public void sort(Node head){
        Node curr=head;
        Node index=null;
        if(head==null){
            return;
        }
        else
        {
            while (curr!=null)
            {
                index=curr.next;
                while(index!=null)
                {
                    if(curr.data > index.data)
                    {
                        int temp=curr.data;
                        curr.data=index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                curr=curr.next;
            }
        }

    }
    public static void main(String[] args) {
        bubble_sort_singlyLnkedList obj=new bubble_sort_singlyLnkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0 ;i<n; i++)
        {
            obj.addList(sc.nextInt());
        }
        obj.printList();

        obj.sort(head);
        System.out.println();
        obj.printList();
    }
}
