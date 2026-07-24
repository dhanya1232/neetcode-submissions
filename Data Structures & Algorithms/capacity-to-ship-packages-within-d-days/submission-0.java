class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;

        for(int w:weights){
          left=Math.max(left,w);
          right+=w;
        }

        int ans=right;

        while(left<=right){
          int mid=left+(right-left)/2;
          if(canSplit(weights,days,mid)){
            ans=mid;
            right=mid-1;
          }else{
            left=mid+1;
          }
        }
        return ans;
    }
    public boolean canSplit(int[] weights,int days,int limit){
      int currentSum=0;
      int workers=1;

      for(int w:weights){
          if(currentSum+w<=limit){
            currentSum+=w;
          }else{
            workers++;
            currentSum=w;
          }

      }
      return workers<=days;

      
    }
}