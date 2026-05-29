class TreeNode{
    int key;
    TreeNode left , right;
    public TreeNode(int key){
        this.key = key;
    }
}

boolean contains(TreeNode root,int key){
    while(root != null){
    if(key < root.key ) root = root.left;
    else if(key > root.key) root = root.right;
    else return true;
    }
    return false;
}

TreeNode insert(TreeNode root , int key){
    if(root == null) return new TreeNode(key);
    if(key < root.key) root.left = insert(root.left,key);
    if(key > root.key) root.right = insert(root.right,key);
    return root;
}


void main(){
    TreeNode root = new TreeNode(5);
    root.left  = new TreeNode(2);
    root.right = new TreeNode(7);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(10);

    System.out.println(contains(root,7) ? "Tree contains element" : "Tree Not contains element");


}