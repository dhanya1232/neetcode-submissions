class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;   //i need to find min so if initialised to 0 then everytime 0 will be chosen thts y hv the max val

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}