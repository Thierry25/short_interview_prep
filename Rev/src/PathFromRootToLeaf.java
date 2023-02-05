public class PathFromRootToLeaf {
    public static void main(String[] args) {
        Node rootNode=createBinaryTree();
        System.out.println("Printing all paths from root to leaf :");
        printAllPathsToLeaf(rootNode,new int[1000],0);

    }

    private static int getMaximum(Node root){
        int max = Integer.MIN_VALUE;
        int value;
        int left, right;
        if(root != null){
            value = root.data;
            left = getMaximum(root.left);
            right = getMaximum(root.right);

            max = Math.max(left, right);
            max = Math.max(max, value);
        }
        return max;
    }

    public static void printAllPathsToLeaf(Node node, int[] path, int len) {
       if(node == null) return;
       path[len] = node.data;
       len++;

       if(node.left == null && node.right == null){
           printArray(path, len);
           return;
       }
       printAllPathsToLeaf(node.left, path, len);
       printAllPathsToLeaf(node.right, path, len);
    }
    public static Node createBinaryTree()
    {

        Node rootNode =new Node(40);
        Node node20=new Node(20);
        Node node10=new Node(10);
        Node node30=new Node(30);
        Node node60=new Node(60);
        Node node50=new Node(50);
        Node node70=new Node(70);
        Node node5=new Node(5);
        Node node55=new Node(55);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;
        node10.left=node5;
        node50.right=node55;

        return rootNode;
    }

    private static void printArray(int[] path, int len) {
        for(int i = 0; i < len; i++){
            System.out.printf("%d ", path[i]);
        }
        System.out.println();
    }

    public static class Node{
        Node left, right;
        int data;
        public Node(int data){
            this.data = data;
        }
   }

}
