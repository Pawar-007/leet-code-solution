package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree {
     public static void main(String[] args) {
        TreeNode tr=new TreeNode();
        Solution s=new Solution();
        s.averageOfLevels(tr);
     }
}

class Solution {
   public List<Double> averageOfLevels(TreeNode root) {
      if (root == null) {
         return null;
      }
      Queue<TreeNode> que = new LinkedList<>();
      List<Double> ans = new ArrayList<>();
      que.offer(root);
      while (!que.isEmpty()) {
         int size = que.size();
         double sum = 0;
         for (int i = 0; i < size; i++) {
            TreeNode temp = que.peek();
            if (temp == null) {
               continue;
            }
            sum += temp.val;
            if (temp.left != null) {
               que.offer(temp.left);
            }
            if (temp.right != null) {
               que.offer(temp.right);
            }
            que.poll();
         }
         ans.add(sum / size);
      }
      return ans;
   }
}