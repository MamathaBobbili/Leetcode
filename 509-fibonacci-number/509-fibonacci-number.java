class Solution {
    /** Memoization : Top Down approach 
    Start from the given number and to base case
    **/ 
    
    // public int fib(int n) {
    //     if(n<=1)
    //         return n;
    //     else
    //         return fib(n-1)+fib(n-2);
    // }
    
    /** Tabulation: Bottom Up approach
        start from 0 and go to n
    **/
    // public int fib(int n) {
    //     int dp[]=new int[n+1];
    //     dp[0]=0;dp[1]=1;
    //     for(int i=2;i<=n;i++){
    //         dp[i]=dp[i-1]+dp[i-2];
    //     }
    //     return dp[n];
    // }
    
    /** Space Optimization 
        Rather than using array , we are trying with two pointers
    **/
    
     public int fib(int n) {
        int prev2=0;
        int prev1=1;
         
        if(n==0)
         return prev2;
        if(n==1)
            return prev1;
        
        int curr=0;
        for(int i=2;i<=n;i++){
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }
}