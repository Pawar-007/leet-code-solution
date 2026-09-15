//845. Longest Mountain in Array
public class longest_Mountain {
   public static int longestMountain(int[] arr) {
      if (arr.length < 3) {
         return 0;
      }
      int mount = 0;

      for (int i = 1; i < arr.length - 1; i++) {
         if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
            int l = i;
            int r = i;
            while (l > 0 && arr[l - 1] < arr[l])
               l--;
            while (r < arr.length - 1 && arr[r] > arr[r + 1])
               r++;
            mount = Math.max(mount, r - l + 1);
         }
      }

      return mount;
   }

   public static void main(String[] args) {
      int [] arr={2,1,4,7,3,2,5};
      int mount=longestMountain(arr);
      System.out.println(mount);
   }
}
