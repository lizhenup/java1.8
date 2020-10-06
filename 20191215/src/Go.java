public class Go {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode ret = binaryTree.find(binaryTree.buildTree(),'D');
        System.out.println(ret.value);
    }
}
