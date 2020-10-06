package Solution;
class Solution {
    public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
        if(leftTree == null &&rightTree != null
                || leftTree != null && rightTree == null) {
            return false;
        }
        if(leftTree == rightTree) {
            return true;
        }
        return leftTree.val == rightTree.val
                && isSymmetricChild(leftTree.left,rightTree.right)
                && isSymmetricChild(rightTree.left,leftTree.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }
}
