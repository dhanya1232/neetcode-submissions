class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int max=0;
        int ans=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            max=Math.max(max,freq[ch-'A']);
            while((right-left+1)-max>k){  //for sliding window always use the while condn which is the invalid of the window size
                 freq[s.charAt(left)-'A']--;
                 left++;
            }
            ans=Math.max(ans,(right-left+1));
        }
        return ans;
    }
}
