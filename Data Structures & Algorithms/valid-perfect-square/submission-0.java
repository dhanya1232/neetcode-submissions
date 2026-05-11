class Solution {
    public boolean isPerfectSquare(int num) {
       long ryt=num;
       long left=1;

       
       while(left<=ryt){

        long mid=(left+ryt)/2; 
       long square=mid*mid;
       
       if(square==num){
        return true;
       }
       else if(square<num){
        left=mid+1;
       }else{
        ryt=mid-1;
       }
       }
       return false;
    }
}