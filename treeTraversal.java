import java.util.LinkedList;
import java.util.Queue;

public class treeTraversal {
    static  class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static  class  BinaryTreeImpl{
        static int idx = -1;
        public  static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return  null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public  static  void preOrderTraversal(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public  static  void InOrderTraversal(Node root) {
        if(root == null){
            return;
        }
        InOrderTraversal(root.left);
        System.out.print(root.data+" ");
        InOrderTraversal(root.right);
    }
    public  static  void postOrderTraversal(Node root) {
        if(root ==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr = q.remove();
            if(curr == null)
            {
                System.out.println();
                //queue empty
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeImpl tree=new BinaryTreeImpl();
        Node root = tree.buildTree(nodes);
        System.out.print("Pre-Order Traversal is : ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("In-Order Traversal is : ");
        InOrderTraversal(root);
        System.out.println();
        System.out.print("Post-Order Traversal is : ");
        postOrderTraversal(root);
        System.out.println();
        System.out.print("Level-Order Traversal is : ");
        System.out.println();
        levelOrderTraversal(root);
    }
}
