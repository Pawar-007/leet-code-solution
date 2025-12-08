// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

// Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

// The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

class Solution {
   public int removeDuplicates(int[] nums) {
      int n = nums.length;
      int writeIndex = 0;
      int readIndex = 0;
      while (readIndex < n) {
         int nextIndex = readIndex + 1;
         while (nextIndex < n && nums[readIndex] == nums[nextIndex]) {
            nextIndex++;
         }
         nums[writeIndex] = nums[readIndex];
         writeIndex++;
         readIndex = nextIndex;
      }
      int ans = writeIndex;
      while (writeIndex < n) {
         nums[writeIndex] = 0;
         writeIndex++;
      }
      return ans;
   }
}