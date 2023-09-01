public class SinglyLL_implementation {
      Node head;
      static int size=0;

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            next=null;
            size++;
        }
    }
    public void addLast(String data){
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
    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.print("null");
            return;
        }
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print("null");
    }
    public  int size(){
        return  size;
    }

    public void removeFirst(){
        if(head==null){
             System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node prt=head;
        while(prt.next.next!=null){
            prt=prt.next;
        }
        prt.next=null;
        size--;
    }

    public  void  addSomewhere(String data, int position){
        if(position<1 || position>size+1){
            System.out.print("Invalid Position");
            return;
        }
        Node newNode=new Node(data);
        if(position==1){
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
        SinglyLL_implementation obj=new SinglyLL_implementation();
        obj.addLast("Hi");
        obj.addLast("this");
        obj.addLast("is");
        obj.addLast("newton");
        obj.addLast("school");
        System.out.println(obj.size());

        obj.printList();
        System.out.println();

        obj.addLast("Hello");
        obj.printList();
        System.out.println();

        obj.addFirst("jagdeesh");
        obj.addFirst("kumar");

        obj.printList();
        System.out.println();

        obj.removeFirst();
        obj.printList();
        System.out.println();
        System.out.println(obj.size());

        obj.removeLast();
        obj.printList();
        System.out.println();
        System.out.println(obj.size());

        obj.addSomewhere("Delhi",0);;
        System.out.println();
        obj.printList();
    }
}
