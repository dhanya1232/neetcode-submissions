class Solution {
    public int maxProductDifference(int[] nums) {
      Arrays.sort(nums);

      int left=0;
      int right=nums.length-1;

      return (nums[right]*nums[right-1])-(nums[left]*nums[left+1]);  
    }
}