class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> st=new Stack<>();
       for(String p:operations){
        if(p.equals("C"))
        st.pop();
        else if(p.equals("D"))
        st.push(st.peek()*2);
        else if(p.equals("+")){
        int a=st.pop();
        int b=st.peek();
        int add=a+b;
        st.push(a);
        st.push(add);
       }
       else{
        st.push(Integer.parseInt(p));
       }
       }
       int sum=0;
       for(int n:st){
       sum=sum+n; 
       }
       return sum;
    }
}