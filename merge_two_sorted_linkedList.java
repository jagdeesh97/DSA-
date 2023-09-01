public class merge_two_sorted_linkedList {
    Node head1;
    Node head2;
    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;

        }
    }

    public  void addLast(int val){   //creating first linked list
        Node newNode=new Node(val);
        if(head1==null){
            head1=newNode;
            return;
        }
        Node ptr=head1;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
    }
    public  void addLast1(int val){   //creating first linked list
        Node newNode=new Node(val);
        if(head2==null){
            head2=newNode;
            return;
        }
        Node ptr=head2;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
    }
    public void merge_list(Node head1, Node head2 ){
        while(head1!=null && head2!=null)
        {
        //  if(head1.val<head2.val)
        }

    }

    public static void main(String[] args) {
        merge_two_sorted_linkedList obj=new merge_two_sorted_linkedList();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);

        obj.addLast1(3);// Second list
        obj.addLast1(4);
        obj.addLast1(6);
        obj.addLast1(8);
        obj.addLast1(9);
        obj.addLast1(10);
    }

}
