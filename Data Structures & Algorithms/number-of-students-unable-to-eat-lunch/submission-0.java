class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
      Queue <Integer> q=new LinkedList<>();  
      
      int j=0;
      int count=0;
      for(int s:students){
        q.offer(s);
      }
      while(!q.isEmpty() && count<students.length){
      
      if(q.peek()==sandwiches[j]){
      q.poll();  ///if student like the sandwich then delete it n move the sandwich pointer to the front
      j++;  
      count=0;
      }else{
        q.offer(q.poll()); //if the student doesnt like the sandwich then the top is removed n added to the end of the queue 
        count++;
      }
      }
      return q.size();
    }
}