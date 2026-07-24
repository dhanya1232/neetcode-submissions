class Solution {
    public int maxProduct(int[] nums) {
        int maxProb=nums[0];
        int minProb=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
          int curr=nums[i];
          int tempMax=Math.max(curr,Math.max(curr*maxProb,curr*minProb));
          minProb=Math.min(curr,Math.min(curr*maxProb,curr*minProb));
          maxProb=tempMax;
          ans=Math.max(ans,maxProb);
        }
        return ans;
    }
}
