package Tree;

public class SameTree {
   public static void main(String[] args) {
      TreeNode tr = new TreeNode();
      TreeNode tr2 = new TreeNode();
      Solution s = new Solution();
      s.isSameTree(tr, tr2);
   }
}

class Solution {
   public boolean isSameTree(TreeNode p, TreeNode q) {
      if (p == null && q == null)
         return true;

      if (p == null || q == null)
         return false;

      if (p.val != q.val) {
         return false;
      }

      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
   }
}