// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
import java.util.*;
class Solution {
   public int[] twoSum(int[] nums, int target) {
      int n = nums.length;
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
         int moreneed = target - nums[i];

         if (map.containsKey(moreneed)) {
            return new int[] { i, map.get(moreneed) };
         }
         map.put(nums[i], i);
      }
      return new int[] {};
   }

}