class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<heights.length;i++){
            boolean ocean=true;
            for(int j=i+1;j<heights.length;j++){   //this loop is to check if the i th ele is having any ele greter than or equal to i
                if(heights[j]>=heights[i]){
                    ocean=false;
                }
            }
            if(ocean){
                list.add(i);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}