class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int count=0;

        for(int i=0;i<flowerbed.length;i++){
            int left=0;
            int right=0;
            if(i>0){
                left=flowerbed[i-1];
            }
            if(i<flowerbed.length-1){
                right=flowerbed[i+1];
            }
            if(flowerbed[i]==0 && left==0 && right==0 ){
                count++;
                flowerbed[i]=1;
            }
        }
        return n<=count;
    }
}