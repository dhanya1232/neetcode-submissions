class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];

        if(nums.length==1) return nums[0];

        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);  //need both the dp index val to use it in the next part in the future for part

        for(int i=2;i<n;i++){
          dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);  //we are comparing the past dp value with previous 2 dp+num val n use the greatest one
        }
        return dp[n-1];  //the final ans is stored in the last index of dp array
    }
}
