public class sumOfNodes {
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
    public  static int sum_of_nodes(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sum_of_nodes(root.left);
        int rightSum = sum_of_nodes(root.right);

        return leftSum + rightSum +root.data;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeImpl tree=new BinaryTreeImpl();
        Node root = tree.buildTree(nodes);
        System.out.println(sum_of_nodes(root));
    }
}
