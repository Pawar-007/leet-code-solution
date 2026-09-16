package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValuesAtEachLevel {
    public List<Integer> largestValues(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        List<Integer> li=new ArrayList<>();
        while(!qu.isEmpty()){
            int size=qu.size();
            int max=qu.peek().val;

            for(int i=0;i<size;i++){
                TreeNode tr=qu.poll();
                int value=tr.val;
                if(value>max){
                    max=value;
                }

                if(tr.left!=null){
                    qu.offer(tr.left);
                }
                if(tr.right!=null){
                    qu.offer(tr.right);
                }
            }
            li.add(max);
        }
        return li;
    }

    public static void main(String[] args) {
      
    }
}
