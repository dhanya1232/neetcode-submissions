class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){  //keeping the worst case ans in te dp array by keeping the values of i 
            dp[i]=i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=i;j++){ 
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);  //i-j*j is like we r have the target n sub the value so here we want the dp value of wht is required - the square..then we add it by 1 so as to consider the prev val
            }
        }
        return dp[n];
    }
}