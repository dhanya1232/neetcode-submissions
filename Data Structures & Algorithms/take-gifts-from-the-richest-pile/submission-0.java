class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);  //minHeap -stores values in ascending order where the top most ele in the highest
        //Instead of searching every time, store everything in a Max Heap...so use the heap method here
        for(int gift:gifts){
            pq.offer(gift);
        }
        while(k>0){
            int largest=pq.poll();
            int remaining=(int) Math.sqrt(largest);
            pq.offer(remaining);
            k--;
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}