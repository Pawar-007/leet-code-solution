package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class CountLeafNode {
   public int numberOfLevelsInBTusingLevelOrder(TreeNode root) {
      int count = 0;
      if (root == null) {
         return 0;
      }
      Queue<TreeNode> q = new LinkedList<>();
      q.offer(root);
      while (!q.isEmpty()) {
         TreeNode temp = q.poll();
         if (temp.left == null && temp.right == null) {
            count++;
         }
         if (temp.left != null) {
            q.offer(temp.left);
         }
         if (temp.right != null) {
            q.offer(temp.right);
         }
      }
      return count;
   }
}
