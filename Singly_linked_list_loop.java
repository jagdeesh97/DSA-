public class Singly_linked_list_loop {
    public static class Node{
       int val;
       Node next;             // linked list program to print element using for loop

       Node(int n){
           val =n;
           next=null;
       }
    }
    public static void main(String[] args) {

        Node newhead=new Node(0);
        Node pointer=newhead;
        for(int i=1; i<=20; i++)
        {
            Node temp=new Node(i);
            newhead.next=temp;
            newhead=newhead.next;
        }
        while (pointer!=null)
        {
            System.out.print(pointer.val+"->");
            pointer=pointer.next;
        }
        System.out.print("null");

    }
}
