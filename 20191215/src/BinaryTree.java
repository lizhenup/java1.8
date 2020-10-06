class TreeNode {
    char value;
    TreeNode left;
    TreeNode right;
    public TreeNode(char value) {
        this.value = value;
    }
}
public class BinaryTree {

    public BinaryTree() {
    }

    public TreeNode buildTree() {
        TreeNode root = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        root.left = B;
        root.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return root;
    }

    // 前序遍历
    void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }
    int getLeafSize1(TreeNode root) {
        if(root == null) {
            return 0;
        }else if(root.left == null && root.right == null) {
            return 1;
        }
            return getLeafSize1(root.left)+getLeafSize2(root.right);
    }
    static int useSize = 0;
    int getLeafSize2(TreeNode root) {
        if(root == null) {
            return 0;
        }else if(root.left == null && root.right == null) {
            useSize++;
        }
         getLeafSize2(root.left);
         getLeafSize2(root.right);
         return useSize;
    }
    int findKLevelSize(TreeNode root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return findKLevelSize(root.left,k-1) +findKLevelSize(root.right,k-1);
    }
    TreeNode find(TreeNode root,int val) {
        if(root == null) {
            return null;
        }
        if(root.value == val) {
            return root;
        }
        TreeNode ret1 = find(root.left,val);
        if(ret1 != null) {
            return ret1;
        }
        TreeNode ret2 = find(root.right,val);
        if(ret2 != null) {
            return ret2;
        }
        return null;
        }
}