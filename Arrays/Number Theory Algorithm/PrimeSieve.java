// Q2.Largest Prime from Consecutive Prime Sum©leetcode

// You are given an integer n.

// Return the largest prime number less than or equal to n that can be expressed as the sum of one or more consecutive prime numbers starting from 2. If no such number exists,return 0.©leetcode


import java.util.Arrays;
import java.util.ArrayList;
class Solution {
   public int largestPrime(int n) {
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=0;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }

        ArrayList<Integer> ir=new ArrayList<>();
        for(int i=2;i<isPrime.length;i++){
            if(isPrime[i]){
                ir.add(i);
            }
        }

        int sum=0;
        int ans=0;

        for(int i=0;i<ir.size();i++){
            sum+=ir.get(i);

            if(sum>n) break;

            if(isPrime[sum]) ans=sum;
        }
        
        return ans;
    }
}