class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        //int hours=0;
        for(int p:piles){
            max=Math.max(max,p);
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int hours=0;
            
            for(int p:piles){
            hours+=(p+mid-1)/mid;
            }
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        
        return ans;
    }
}
