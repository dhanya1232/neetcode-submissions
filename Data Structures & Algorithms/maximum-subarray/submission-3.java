class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int current=nums[0];

        for(int i=1;i<nums.length;i++){
            current=Math.max(nums[i],current+nums[i]);   //Should I start a new subarray here, or continue the previous one
            max=Math.max(max,current);
        }
        return max;
    }
}
