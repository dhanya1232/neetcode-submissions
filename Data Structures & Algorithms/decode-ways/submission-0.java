class Solution {
    public int numDecodings(String s) {
      int n=s.length();
      int[] dp=new int[n+1];  //all dp problems keep size i extra n store 1 at the end 
      dp[n]=1;
      for(int i=n-1;i>=0;i--){
        if(s.charAt(i)=='0'){
          dp[i]=0;
          continue;
        }
        dp[i]=dp[i+1];    //for only one digit
        if(i+1<n && (s.charAt(i)=='1' || (s.charAt(i)=='2' && s.charAt(i+1)<='6'))){   //if 2 digits are possible
          dp[i]=dp[i]+dp[i+2];
        }
      }
      return dp[0];  //the different ways to combine is stored in the first index of the array
    }
}
