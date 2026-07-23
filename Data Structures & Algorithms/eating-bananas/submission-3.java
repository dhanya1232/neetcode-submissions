class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;

        for(int p:piles){        //this  is to find the max so as to loop till tht speed
            max=Math.max(max,p);
        }
        int left=1;  //cant take 0 cuz then the mid will be 0
        int right=max;
        int ans=0;
        
       while(left<=right){
        int mid=left+(right-left)/2;
        int hours=0;
        
        for(int p:piles){
            hours+=(p+mid-1)/mid;   //the formula for finding hrs is piles/speed->speed here is mid..we hv put -1 to round off the value
        }
        if(hours<=h){
            ans=mid;   //this is to store the previous val, wht if the prev value is less
            right=mid-1;
        }else{
            left=mid+1;
        }
       }
       return ans;
  }
}
