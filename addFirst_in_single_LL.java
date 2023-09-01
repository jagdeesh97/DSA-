public class addFirst_in_single_LL {
    Node head;
    static int size=0;  // global variable to find size of linked list
    public  class Node{
        String data;
        Node next;
        Node(String str){
            data=str;
            next=null;
            size++;   // whenever you create a new node you get size++
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
            //System.out.println(ptr); // to show the address of each node
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print("null");
    }

    public void addFirst(String data){  // adding node at starting of linked list
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public int getSize(){  // method to get size
        return size;
    }
    public void removeFirst(){
        if(head==null){
            System.out.print("list is empty, nothing is to delete");
            return;
        }
      head=head.next;
      size--;  // size is decreased by one
    }
    public void removeLast(){   // remove last node of linked list
        if(head==null){     // when there is no node
            System.out.print("List is empty");
            return;
        }
        if(head.next==null){  // if only one node is then delete it
          head=null;
            return;
        }
        size--;
        Node ptr=head;
        while (ptr.next.next!=null)  // when there are more the one node
        {
            ptr=ptr.next;
        }
        ptr.next=null;

    }
    public void addSomewhere(String data, int position)
    {
        if(position<1 || position > size+1)
        {
          System.out.print("Not a valid position");
          return;
        }
        Node newNode=new Node(data);
        if(position==1)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        Node ptr=head;
        for(int i=1; i<position-1; i++)
        {
          ptr=ptr.next;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;
    }
    public static void main(String[] args) {
        addFirst_in_single_LL obj=new addFirst_in_single_LL();
        obj.addLast("I");
        obj.addLast("Love");
        obj.addLast("My");
        obj.addLast("India");
        obj.addLast("Banglore");
        obj.addLast("Lucknow");
        obj.printList();
        System.out.println("  size= "+size);
        System.out.println();
        obj.addFirst("hello");
        obj.addFirst("Sir");
        obj.printList();
        System.out.println("  size= "+size);
        obj.removeFirst();
        obj.printList();
        System.out.println("  size= "+size);
        obj.removeLast();
        obj.printList();
        System.out.println("  size= "+size);
        obj.addSomewhere("Ram",4);
        obj.printList();
        System.out.println("  size= "+size);
    }
}
