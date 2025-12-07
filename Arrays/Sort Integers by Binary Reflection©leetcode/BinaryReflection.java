// You are given an integer array nums.
// The binary reflection of a positive integer is defined as the number obtained by reversing the order of its binary digits (ignoring any leading zeros) and interpreting the resulting binary number as a decimal.
// Sort the array in ascending order based on the binary reflection of each element. If two different numbers have the same binary reflection, the smaller original number should appear first.
// Return the resulting sorted array.

class Solution {
   public int[] sortByReflection(int[] nums) {
        int n=nums.length;

        int[][] arr=new int[n][2];
        
        for(int i=0;i<n;i++){
            String binary=Integer.toBinaryString(nums[i]);
            String reverse=new StringBuilder(binary).reverse().toString();
            int reverseVal=Integer.parseInt(reverse,2);

            arr[i][0]=nums[i];
            arr[i][1]=reverseVal;
        }

        Arrays.sort(arr,(a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            return a[1]-b[1];
        });

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

        int [] ans =new int[n];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i][0];
        }
        return ans;
    }
}