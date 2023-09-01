public class delete_first_in_single_LL {
    static Node head;
    public class Node {
        String data;
        Node next;

        Node(String str) {
            data = str;
            next = null;
        }
    }
    public  void addLast(String data){  // creating list
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node ptr=head;  //pointer pointing to head
        while(ptr.next!=null){     // When lest is not empty
            ptr=ptr.next;
        }
        ptr.next=newNode;
    }
    public void printList(){
        Node ptr=head;
        while (ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        delete_first_in_single_LL obj=new delete_first_in_single_LL();
        obj.addLast("I");
        obj.addLast("Love");
        obj.addLast("My");
        obj.addLast("India");
        obj.printList();
    }
}
