public class Queue_implementation_using_LinkedList1 {
    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static boolean isEmpty(){
        return (head==null);
    }
    public void enqueue(int data){   // add last of the list
        Node newNode =new Node(data);
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
    public int dequeue(){   // remove first from the list
        if(head==null){
            System.out.println("Queue is empty");
            return -1;
        }
        Node ptr=head;
        head=head.next;
        return ptr.data;

    }
    public void printQueue(){
        if(head==null){
            System.out.println("Queue is empty");
            return;
        }
        Node ptr=head;
        while (ptr.next!=null){
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
        System.out.println(ptr.data);
    }
    public static void main(String[] args) {
        Queue_implementation_using_LinkedList1 obj=new Queue_implementation_using_LinkedList1();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);

        obj.printQueue();
        System.out.println(obj.isEmpty());

        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
    }
}
