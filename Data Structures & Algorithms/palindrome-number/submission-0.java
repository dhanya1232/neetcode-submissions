class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int sum=0;
        while(x>0){
            int digit=x%10;
            x=x/10;
            sum=sum*10+digit;
        }
        return sum==original;
    }
}