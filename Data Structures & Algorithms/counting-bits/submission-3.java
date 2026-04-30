class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=ans[i/2]+(i%2);  //Removing the last bit (i >> 1) Then adding the last bit (i % 2)
            //Drop the last bit to reuse a smaller solved result, then add the last bit to get the answer
        }
        return ans;
    }
}
