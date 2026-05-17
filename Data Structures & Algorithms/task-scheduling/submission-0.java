class Solution {
    public int leastInterval(char[] tasks, int n) {
       int[] freq=new int[26];
       for(char ch:tasks){
        freq[ch-'A']++;
       } 
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int f:freq){
        if(f>0){
            pq.add(f);
        }
       }
       int time=0;
       while(!pq.isEmpty()){
        List<Integer> temp=new ArrayList<>();  //used to store the remaining task when one A is done then ..then out one reduces n 2 r remaining
        int cycle=n+1;
        while(cycle>0 && !pq.isEmpty()){
            int curr=pq.poll();
            if(curr>1){
                temp.add(curr-1);
            }
            time++;
            cycle--;
        }
        for(int num:temp){    //putting back remaining tasks into temp array
            pq.add(num);
        }
        if(!pq.isEmpty()){//idletime
            time=time+cycle;
        }
       }
       return time;
    }
}
