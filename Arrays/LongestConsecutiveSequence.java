import java.util.HashSet;

public class LongestConsecutiveSequence {
   public int longestConsecutive(int[] nums) {
      if (nums.length == 0) {
         return 0;
      }
      HashSet<Integer> hs = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
         hs.add(nums[i]);
      }
      int ans = 0;
      for (int li : hs) {
         if (hs.contains(li - 1))
            continue;

         int num = li;
         int curr = 1;

         while (hs.contains(num + 1)) {
            num++;
            curr++;
         }
         ans = Math.max(ans, curr);
      }
      // System.out.println(ans);
      return ans;
   }
}
