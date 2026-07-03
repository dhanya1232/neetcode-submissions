class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int min=Integer.MAX_VALUE;//if it is 0 then it will take the min as 0
        int max=0;
        for(int  freq:map.values()){
            if(freq%2==0){
                min=Math.min(min,freq);
            }else{
                max=Math.max(max,freq);
            }

        }
        return max-min;
    }
}