class Solution {
    public int mySqrt(int x) {
        int ryt=x;
        int left=0;int ans=0;

        if(x==0|| x==1)
        return x;

        while(left<=ryt){
            int mid=(left+ryt)/2;
            long square=(long) mid*mid;

            if(x==square){
                return mid;
            }
            else if(square<x){
                 left=mid+1;
            }else{
                ryt=mid-1;
            }
        }
        return ryt;
    }
}