package Tree;

public class CountCompleteTreeNodes {
   public static void main(String[] args) {
      TreeNode tr = new TreeNode();
      Solution s = new Solution();
      int ans = s.countNodes(tr);
      System.out.println(ans);
   }
}

class Solution {
   public int leftHeight(TreeNode root) {
      if (root == null) {
         return 0;
      }
      int count = leftHeight(root.left);
      return 1 + count;
   }

   public int rightHeight(TreeNode root) {
      if (root == null) {
         return 0;
      }
      int count = rightHeight(root.right);
      return 1 + count;
   }

   public int countNodes(TreeNode root) {
      if (root == null) {
         return 0;
      }
      int left = leftHeight(root);
      int right = rightHeight(root);

      if (left == right) {
         return (1 << left) - 1;
      }
      return 1 + countNodes(root.left) + countNodes(root.right);
   }
}