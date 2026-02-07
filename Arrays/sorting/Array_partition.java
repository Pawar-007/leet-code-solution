// 561. Array Partition

import java.util.Arrays;

public class Array_partition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int i=0;
        while(i<nums.length){
            sum+=nums[i];
            i+=2;
        }
        return sum;
    }
   public static void main(String[] args) {
      int[] nums = {6,2,6,5,1,2};
      Array_partition ar=new Array_partition();
      int sum=ar.arrayPairSum(nums);
      System.out.println(sum);
   }
}
