import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
   public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> ans = new ArrayList<>();
      HashMap<String, List<String>> st = new HashMap<>();
      for (int i = 0; i < strs.length; i++) {
         char[] ch = strs[i].toCharArray();
         Arrays.sort(ch);
         String temp = new String(ch);
         if (!st.containsKey(temp)) {
            st.put(temp, new ArrayList<>());
         }
         st.get(temp).add(strs[i]);
      }

      for (String key : st.keySet()) {
         ans.add(st.get(key));
      }
      return ans;
   }
}
