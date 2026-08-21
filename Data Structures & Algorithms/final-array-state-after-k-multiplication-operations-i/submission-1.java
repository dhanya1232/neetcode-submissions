class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[] > pq=new PriorityQueue<>(
            (a,b)-> {
                if(a[0]!=b[0])          //if vals diff small val comes first
                return a[0]-b[0];
                return a[1]-b[1];//if the vals same, smaller index comes first
            }
        );

        for(int i=0;i<nums.length;i++){
            pq.add(new int[] {nums[i],i});
        }
       
        for(int i=0;i<k;i++){
            int[] current=pq.poll();
            int value=current[0];
            int index=current[1];
            value=value*multiplier;
            nums[index]=value;
            pq.add(new int[]{value,index});
        }
        return nums;
    }
}