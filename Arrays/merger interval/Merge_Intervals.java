// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

import java.util.ArrayList;
import java.util.Arrays;
class Solution {
   public int[][] merge(int[][] intervals) {
      if (intervals.length == 1) {
         return intervals;
      }

      Arrays.sort(intervals, (a, b) -> {
         return a[0] - b[0];
      });

      int n = intervals.length;
      ArrayList<int[]> output = new ArrayList<>();
      int[] ans = new int[] { intervals[0][0], intervals[0][1] };

      for (int b = 1; b < n; b++) {
         int bmin = intervals[b][0];
         int amax = ans[1];

         if (bmin <= amax) {
            int val1 = ans[0];
            int val2 = (ans[1] > intervals[b][1]) ? ans[1] : intervals[b][1];
            ans[0] = val1;
            ans[1] = val2;
         } else {
            output.add(new int[] { ans[0], ans[1] });
            ans[0] = intervals[b][0];
            ans[1] = intervals[b][1];
         }
      }

      output.add(new int[] { ans[0], ans[1] });

      return output.toArray(new int[output.size()][]);
   }
}



//optimal approch
// class Solution {
//    public int[][] merge(int[][] intervals) {

//       // Step 1: Sort by start time
//       Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

//       ArrayList<int[]> output = new ArrayList<>();

//       // Take the first interval as current interval
//       int[] current = intervals[0];

//       for (int i = 1; i < intervals.length; i++) {
//          int[] next = intervals[i];

//          // If overlapping → merge
//          if (next[0] <= current[1]) {
//             current[1] = Math.max(current[1], next[1]);
//          } else {
//             // No overlap → push current to output
//             output.add(current);
//             current = next; // Move to next interval
//          }
//       }

//       // Add the last interval
//       output.add(current);

//       return output.toArray(new int[output.size()][]);
//    }
// }
