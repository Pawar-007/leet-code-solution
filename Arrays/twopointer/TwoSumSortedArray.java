package twopointer;

import java.util.ArrayList;
import java.util.List;

public class TwoSumSortedArray {
   public static ArrayList<Integer> twoSum(int[] arr, int target) {
      ArrayList<Integer> li=new ArrayList<>();
      int i=0,j=arr.length-1;
      while(i<j){
         int sum=arr[i]+arr[j];
         if(sum<target){
            i++;
         }
         else if(sum>target){
            j--;
         }
         else{
            li.add(arr[i]);
            li.add(arr[j]);
            break;
         }
      }
      if (li.isEmpty()) {
         li.add(-1);
         li.add(-1);
      }
      return li;
    }
   public static void main(String[] args) {
      int [] arr={2,7,11,15};
      ArrayList<Integer> li=twoSum(arr,17);
      for(int i=0;i<li.size();i++){
         System.out.println(li.get(i));
      }
   }
}
