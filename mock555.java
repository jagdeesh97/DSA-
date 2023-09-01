import java.util.LinkedList;
public class mock555 {
    Node head;
    public  class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;

        }
    }
    public void push(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public  int pop(){
        if(head==null)
        {
            System.out.print("Stack is empty");
            return -1;
        }
        if(head.next==null){
            head=null;
            return -1;
        }
        Node ptr=head;
        while (ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;
        return ptr.data;

    }
    public void print(){
        Node ptr=head;
        while (ptr!=null)
        {
            System.out.print(ptr.data);
            ptr=ptr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {  // 1 2 3 4 5
        mock555 obj=new mock555();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.print();
        System.out.print(obj.pop()+" ");

        obj.print();

    }
}
