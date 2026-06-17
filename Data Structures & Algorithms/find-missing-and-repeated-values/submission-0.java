class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        HashSet<Integer>set=new HashSet<>();
        int repeated=0;
        int missing=0;
        for(int[] row:grid){
            for(int i:row){
                if(set.contains(i)){
                    repeated=i;
                }else{
                    set.add(i);
                }
            }
        }
        for(int i=1;i<=n*n;i++){
            if(!set.contains(i)){
                missing=i;
            }
        }
        return new int[]{repeated,missing};
    }
}