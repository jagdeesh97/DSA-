public class create_Linked_list {
    Node head;
    public  class Node{
        String data;
        Node next;
        Node(String str){
            data=str;
            next=null;
        }
    }
   public  void addLast(String data){  // add node method
        Node newNode=new Node(data);

        if(head==null){  //  It means Empty list
        head=newNode;
        return;
        }
        Node ptr=head;   //pointer pointing to head
        while(ptr.next!=null){     // When lest is not empty
            ptr=ptr.next;
        }
        ptr.next=newNode;  // when pointer is null add new node
   }
   public void printList(){
       Node ptr=head;
      // System.out.print(ptr);  // to show the address of ptr
       while (ptr!=null){
            System.out.println(ptr); // to show the address of each node
           System.out.print(ptr.data+"->");
           ptr=ptr.next;
       }
       System.out.print("null");
   }
    public static void main(String[] args) {
        create_Linked_list obj=new create_Linked_list();
        obj.addLast("I");
        obj.addLast("Love");
        obj.addLast("My");
        obj.addLast("India");
        obj.printList();
    }
}
