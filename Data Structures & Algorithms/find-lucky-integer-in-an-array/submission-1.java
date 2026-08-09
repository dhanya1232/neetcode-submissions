class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int  a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int max=-1;
        for(int a:arr){
            if(a==map.get(a))
            max=Math.max(max,a);
        }
        return max;
    }
}