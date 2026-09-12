import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KFrequentElements {
   public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int temp:nums){
            mp.put(temp,mp.getOrDefault(temp,0)+1);
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)->mp.get(b)-mp.get(a)
        );

        for(int key:mp.keySet()){
            pq.add(key);
        }
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}
