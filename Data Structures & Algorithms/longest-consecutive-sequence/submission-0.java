class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null)
        return 0;
        int count=0;
        int longest=0;
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int n:set){
            if(!set.contains(n-1)){
                count=1;
                //int current=n;
        while(set.contains(n+1)){
            count++;
            n++;
            //current++;
        }
        longest=Math.max(longest,count);
        }
        }
        return longest;
    }
}
