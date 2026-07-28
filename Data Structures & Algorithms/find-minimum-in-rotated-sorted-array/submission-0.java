class Solution {
    public int findMin(int[] nums) {
        //int min=0;
        int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;  //sometimes mid can be  the min so we arent gonna do right=mid-1
            }
        }
        return nums[right];
    }
}
