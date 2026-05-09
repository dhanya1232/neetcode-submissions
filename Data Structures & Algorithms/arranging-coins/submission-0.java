class Solution {
    public int arrangeCoins(int n) {
       int count=0;
       int row=1;

       while((long)row*(row+1)/2<=n){
        count++;
        row++;
       } 
       return count;
    }
}