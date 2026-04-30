class MinStack {
      private Stack<Integer> mainstack;
    private Stack<Integer> minstack;
    public MinStack() {
         mainstack=new Stack<>();
         minstack=new Stack<>();
        }
    
    public void push(int val) {
      mainstack.push(val);
      if(minstack.isEmpty() || val<=minstack.peek())
      minstack.push(val);  
    }
    
    public void pop() {
        if(mainstack.isEmpty())
        return;
     int removed=mainstack.pop();
     if(removed==minstack.peek())
     minstack.pop();
     }
    
    public int top() {
       return mainstack.peek(); 
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
