package Tree;

public class subTree865 {
   public static void main(String[] args) {

   }
}

class Solution {
   public int lengthOftree(TreeNode root) {
      if (root == null) {
         return 0;
      }
      int left = lengthOftree(root.left);
      int right = lengthOftree(root.right);

      return 1 + Math.max(left, right);
   }

   public TreeNode subtreeWithAllDeepest(TreeNode root) {
      if (root == null) {
         return null;
      }

      int left = lengthOftree(root.left);
      int right = lengthOftree(root.right);

      if (left == right) {
         return root;
      }

      if (left > right) {
         return subtreeWithAllDeepest(root.left);
      }

      return subtreeWithAllDeepest(root.right);
   }
}
