// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

//hashset and hashmap
import java.util.*;
class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
      int target = 0;
      HashSet<List<Integer>> ans = new HashSet<>();

      int n = nums.length;
      for (int i = 0; i < n; i++) {
         HashMap<Integer, Integer> hs = new HashMap<>();
         for (int j = i + 1; j < n; j++) {
            int x3 = target - nums[i] - nums[j];
            if (hs.containsKey(x3)) {
               List<Integer> temp = new ArrayList<>();
               temp.add(nums[i]);
               temp.add(nums[j]);
               temp.add(x3);
               Collections.sort(temp);
               ans.add(temp);
            }
            hs.put(nums[j], j);
         }
      }

      return new ArrayList<>(ans);
   }
}

//two pointer approach
// class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//       List<List<Integer>> ans = new ArrayList<>();
//       int n = nums.length;
//       Arrays.sort(nums);
//       for (int i = 0; i < n; i++) {
//          int first = nums[i];
//          int j = i + 1;
//          int k = n - 1;
//          if (i > 0 && nums[i] == nums[i - 1])
//             continue;
//          while (j < k) {
//             int sum = first + nums[j] + nums[k];
//             if (sum > 0) {
//                k--;
//             } else if (sum < 0) {
//                j++;
//             } else {
//                ans.add(Arrays.asList(first, nums[j], nums[k]));
//                j++;
//                k--;
//                while (j < k && nums[j] == nums[j - 1]) {
//                   j++;
//                }
//             }

//          }
//       }
//       return ans;
//    }
// }