class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int p:piles){
            max=Math.max(max,p);
        }
        int left=1;  //cant take 0 cuz then the mid will be 0
        int right=max;
        int ans=0;
        
       while(left<=right){
        int mid=left+(right-left)/2;
        int hours=0;
        
        for(int p:piles){
            hours+=(p+mid-1)/mid;
        }
        if(hours<=h){
            ans=mid;
            right=mid-1;
        }else{
            left=mid+1;
        }
       }
       return left;
  }
}
