package Tree;

public class SearchBST {
   public TreeNode searchBST(TreeNode root, int val) {
      if (root == null) {
         return null;
      }

      if (root.val == val) {
         return root;
      }

      TreeNode t1 = searchBST(root.left, val);
      TreeNode t2 = searchBST(root.right, val);

      if (t1 != null) {
         return t1;
      } else {
         return t2;
      }

   }

   public static void main(String[] args) {
      
   }
}
