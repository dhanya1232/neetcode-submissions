class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);  //key- num value , value-freq
            }else{
                map.put(num,1);
            }
            if(map.get(num)>nums.length/2) //condition given in the qs  
            return num;
        }
        return -1;
    }
}