package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class WidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<Pair<TreeNode,Long>> qu=new LinkedList<>();
        qu.offer(new Pair<TreeNode,Long>(root,0L));
        int maxWidth=0;
        while(!qu.isEmpty()){

            int size=qu.size();
            long first=qu.peek().index;
            long last=first;

            for(int i=0;i<size;i++){
                Pair<TreeNode,Long> pr=qu.poll();
                
                TreeNode node=pr.node;
                Long index=pr.index;

                last=index;

                if(node.left!=null){
                    qu.offer(new Pair<>(node.left,2*index+1));
                }
                if(node.right!=null){
                    qu.offer(new Pair<>(node.right,2*index+2));
                }

                int width=(int)(last-first+1);
                maxWidth=Math.max(maxWidth,width);
            }
        } 
        

        return maxWidth;
    }

    public static void main(String[] args) {
      
    }
}

class Pair<T, R> {
   public T node;
   public R index;

   Pair(T node, R index) {
      this.node = node;
      this.index = index;
   }
}



class TreeNode {
   
   int val;
   TreeNode left;
   TreeNode right;

   TreeNode() {
   }

   TreeNode(int val) {
      this.val = val;
   }

   TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}