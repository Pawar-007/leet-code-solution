class MissingNumber {
   public static int missingNumber(int[] nums) {
      int n = nums.length;
      int totalSum = n * (n + 1) / 2;
      int sum = 0;
      for (int i = 0; i < n; i++) {
         sum += nums[i];
      }

      return totalSum - sum;
   }

   public static void main(String[] args) {
      int[] nums = { 3, 0, 1 };
      System.out.println(missingNumber(nums));
   }
}