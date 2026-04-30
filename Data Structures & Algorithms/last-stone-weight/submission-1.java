class Solution {
    public int lastStoneWeight(int[] stones) {
     PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
     for(int s: stones){
        maxheap.add(s);
     }   
     while(maxheap.size()>1){
        int y=maxheap.poll();
        int x=maxheap.poll();
        if(y>x){
            maxheap.add(y-x);
        }
     }
     return maxheap.isEmpty()?0:maxheap.peek();
    }
}
