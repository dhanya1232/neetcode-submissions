class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();

       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       } 
       int[] ans=new int[k];
       PriorityQueue<Integer> pq=new  PriorityQueue<>((a,b)->Integer.compare(map.get(b),map.get(a)));
       for(int key:map.keySet()){
        pq.add(key);
       }
       for(int i=0;i<k;i++){
        ans[i]=pq.poll();
       }
       return ans;
    }
}
