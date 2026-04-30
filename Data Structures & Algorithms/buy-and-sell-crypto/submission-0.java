class Solution {
    public int maxProfit(int[] prices) {
       int max=0;
       int min=prices[0] ;
       for (int p: prices){
        if(p<min){
        min=p;
       }else{
        max=Math.max(max,p-min);
       }
    }
       return max;
    }
 
}

