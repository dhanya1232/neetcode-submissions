class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int pile:piles){
            max=Math.max(pile,max);
        }
        for(int speed=1;speed<=max;speed++){
            long hours=0;
            for(int pile:piles){
                hours+=(pile+speed-1)/speed;
            }
            if(hours<=h){
                return speed;
            }
        }
        return max;
    }
}
