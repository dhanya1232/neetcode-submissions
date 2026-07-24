class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
      if(n==1) return nums[0];

      return Math.max(robber(nums,0,n-2),
      robber(nums,1,n-1));
        
    }
    public int robber(int[] nums,int start,int end){
        int n=nums.length;
        int[] dp=new int[n];

        if(start==end) return nums[start];

        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);

        for(int i=start+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[end];
    }
}
