import java.util.Scanner;

public class Doubly_LinkedList {
    static Node head;
    static int size=0;
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
            size++;
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
        newNode.prev=ptr;
    }
    public void printList(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        Node ptr=head;
        System.out.print("null<-");
        while (ptr.next!=null){
            System.out.print(ptr.data+"<->");
            ptr=ptr.next;
        }
        System.out.print(ptr.data);
        System.out.print("->null");
    }
    public int getSize(){
        return size;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
            newNode.next=head;
            if(head!=null) {
                head.prev = newNode;
            }
            head=newNode;

    }
    public void addLast(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
        newNode.prev=ptr;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        if(head.next==null){
            System.out.print("null");
            return;
        }
        Node ptr=head;
        ptr=ptr.next;
        head=ptr;
        head.prev=null;
        size--;
    }
    public void deleteLast(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node ptr=head;
        while (ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;
        size--;
    }
    public void deleteGivenNode(Node deletingNode){  // given reference of a deleting node you have to delete it
      if(head==null){
          System.out.print("Wrong node to delete");
          return;
      }
      if(deletingNode==head){
          head=deletingNode.next;  // head=head.next;
      }
      if(deletingNode.next!=null){  // checking next of  deleting node is not null
          deletingNode.next.prev=deletingNode.prev;
      }
      if(deletingNode.prev!=null){  // checking that previous of deleting node is not null
          deletingNode.prev.next=deletingNode.next;
      }
      size--;
    }
    public static void main(String[] args) {
        Doubly_LinkedList obj=new Doubly_LinkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            obj.addList(sc.nextInt());
        }
        int k=sc.nextInt();
        obj.printList();
        System.out.println();
        System.out.println("size of list is = "+obj.getSize());

        obj.addFirst(k);
        obj.printList();
        System.out.println();
        System.out.println("After adding a node at front the size of list is = "+obj.getSize());

        obj.addLast(k);
        obj.printList();
        System.out.println();
        System.out.println("After adding a node at last the size of list is = "+obj.getSize());

        obj.deleteFirst();
        obj.printList();
        System.out.println();
        System.out.println("After deleting a node from  front the size of list is = "+obj.getSize());

        obj.deleteLast();
        obj.printList();
        System.out.println();
        System.out.println("After deleting a node from last the size of list is = "+obj.getSize());

        Node deletingNode=head.next.next.next;
        obj.deleteGivenNode(deletingNode);
        obj.printList();
        System.out.println();
        System.out.println("After deleting given node the size of list is = "+obj.getSize());
    }
}
