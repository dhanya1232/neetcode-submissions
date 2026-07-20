class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;

        if(nums.length==0){
            return new int[]{-1,-1};
        }

        int[] ans={-1,-1};

        while (i < nums.length && nums[i] != target) {
            i++;
        }

        // Find last occurrence
        while (j >= 0 && nums[j] != target) {
            j--;
        }

        if (i <= j) {
            ans[0] = i;
            ans[1] = j;
        }

        return ans;
    }
}