import java.util.HashMap;
import java.util.Map;

class MaxFrequencyElements{
   public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int maxFreq=0;
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            if(maxFreq<hs.get(nums[i])){
                maxFreq=hs.get(nums[i]);
            }
        }
        int total=0;
        for(Map.Entry<Integer,Integer> temp:hs.entrySet()){
            if(temp.getValue()==maxFreq){
                total+=temp.getValue();
            }
        }
        return total;
    }
    public static void main(String[] args) {
      int [] nums={1,2,2,3,1,4};
      System.out.println(maxFrequencyElements(nums));
    }
}