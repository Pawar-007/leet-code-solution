// You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

// Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

// Return intervals after the insertion.

// Note that you don't need to modify intervals in-place. You can make a new array and return it.
import java.util.ArrayList;
class Solution {
   public int[][] insert(int[][] intervals, int[] newInterval) {
      ArrayList<int[]> arr = new ArrayList<>();
      int i = 0;
      int n = intervals.length;
      while (i < n && intervals[i][1] < newInterval[0]) {
         arr.add(intervals[i]);
         i++;
      }

      while (i < n && intervals[i][0] <= newInterval[1]) {
         newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
         newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
         i++;
      }
      arr.add(newInterval);
      while (i < n) {
         arr.add(intervals[i]);
         i++;
      }

      return arr.toArray(new int[arr.size()][]);
   }
}