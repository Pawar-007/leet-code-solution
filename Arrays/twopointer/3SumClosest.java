//16. 3Sum Closest
// Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
// Return the sum of the three integers.
// You may assume that each input would have exactly one solution.
import java.util.*;

class Solution {
   public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int n = nums.length;
      int ans = nums[0] + nums[1] + nums[2];
      for (int i = 0; i < n; i++) {
         int temp = nums[i];
         int j = i + 1;
         int k = n - 1;

         while (j < k) {
            int sum = temp + nums[j] + nums[k];
            if (Math.abs(sum - target) <= Math.abs(ans - target)) {
               ans = sum;
            }
            if (sum < target)
               j++;
            else if (sum > target)
               k--;
            else
               return sum;
         }
      }
      return ans;
   }
}