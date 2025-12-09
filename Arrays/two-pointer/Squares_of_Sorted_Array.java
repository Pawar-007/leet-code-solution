// 977. Squares of a Sorted Array

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



class Solution {
   public int[] sortedSquares(int[] nums) {
      int[] ans = new int[nums.length];
      int left = 0;
      int right = nums.length - 1;
      int pos = nums.length - 1;

      while (left <= right) {
         int val1 = Math.abs(nums[left]);
         int val2 = Math.abs(nums[right]);
         if (val1 <= val2) {
            ans[pos] = val2 * val2;
            right--;
         } else {
            ans[pos] = val1 * val1;
            left++;
         }
         pos--;
      }

      return ans;
   }
}