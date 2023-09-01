public class Singly_linked_list {
    public static class Node   // First linked list program to create a single linked list and then print it/
    {
        String data;  //any datatype
        Node next;  //next is the reference to store the address of next node
        Node(String str){  //Constructor
            data=str;
            next=null;
        }
    }
    public static void main(String[] args) {
        Node n1=new Node("Hey!"); //Constructor function to initialise the value
        Node n2=new Node("I");
        Node n3=new Node("Love");
        Node n4=new Node("my");
        Node n5=new Node("India");
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        Node head=n1;
        while(head!=null) {
            System.out.print(head.data+"-> ");
            head=head.next;
        }
        System.out.print("null");
    }
}
