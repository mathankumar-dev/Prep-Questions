
public class TreeNode {
    int data;
    TreeNode left ;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

void preOrder(TreeNode root){
    if(root == null) return;
    System.out.print( root.data +" ");
    preOrder(root.left);
    preOrder(root.right);
}
void inOrder(TreeNode root){
    if(root == null) return;
    inOrder(root.left);
    System.out.print( root.data +" ");
    inOrder(root.right);
}
void postOrder(TreeNode root){
    if(root == null) return;
    postOrder(root.left);
    postOrder(root.right);
    System.out.print( root.data +" ");
}

void main() {
    TreeNode root = new TreeNode(10);

    root.left = new TreeNode(5);
    root.right = new TreeNode(20);

    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);

    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(45);

    System.out.println("Inorder:");
    inOrder(root);

    System.out.println();

    System.out.println("Preorder:");
    preOrder(root);

    System.out.println();

    System.out.println("PostOrder:");
    postOrder(root);
}