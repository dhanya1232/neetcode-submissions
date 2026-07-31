class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();   //Java's PriorityQueue is a Min Heap by default.Smallest element is always at the top.
        for(int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
return pq.peek();
    }
}
