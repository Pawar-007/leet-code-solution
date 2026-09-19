package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths257 {
   public static void main(String[] args) {

   }
}

class Solution {
   public void path(TreeNode root, List<String> ans, LinkedList<Integer> str) {

      if (root == null) {
         return;
      }
      str.addLast(root.val);
      if (root.left == null && root.right == null) {
         StringBuilder st = new StringBuilder();
         for (Integer num : str) {
            st.append(num + "->");
         }
         st.delete(st.length() - 2, st.length());
         ans.add(st.toString());
      } else {
         path(root.left, ans, str);
         path(root.right, ans, str);
      }

      str.removeLast();

   }

   public List<String> binaryTreePaths(TreeNode root) {
      List<String> li = new ArrayList<>();
      if (root == null) {
         return li;
      }
      LinkedList<Integer> str = new LinkedList<>();
      path(root, li, str);
      return li;
   }
}