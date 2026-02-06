// 628. Maximum Product of Three Numbers
import java.util.Arrays;

public class max_pro_3_num {
   public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int pro1=nums[0]*nums[1]*nums[n-1];
        int pro2=nums[n-3]*nums[n-2]*nums[n-1];
        return Math.max(pro1,pro2);
   }

   public static void main(String[] args) {
      
   }


}
