import java.util.HashMap;
import java.util.Map;

public class NextGreater {
   public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hs.put(nums2[i],i);
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int index=hs.get(nums1[i]);
           
            while(i<nums1.length && index<nums2.length){
                if(nums2[index]>nums1[i]){
                    break;
                }
                index++;
            }
            if(index<nums2.length){
               ans[i]=nums2[index];
            }
            else{
                ans[i]=-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
      int[] num1={4,1,2};
      int[] num2={1,3,4,2};
      int[] arr=nextGreaterElement(num1,num2);
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
      }
    }
}
