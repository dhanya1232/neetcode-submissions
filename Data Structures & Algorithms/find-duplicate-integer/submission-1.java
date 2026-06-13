class Solution {
    public int findDuplicate(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        int res=0;
        for(int num:nums){
            if(set.contains(num)){
                return num;
            }
          set.add(num);
        }
        return -1;
    }
}
