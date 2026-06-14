class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;
    }
    public void backtrack(List<String> result,String current,int open,int close,int n){
        if(current.length()==2*n){  //store the each ans generated 
            result.add(current);
            return;
        }
        if(open<n){
            backtrack(result, current+"(", open+1, close,n); //if(open < n).. add "("
   
        }
        if(close<open){
            backtrack(result,current+")",open,close+1,n); //if(close < open)...  add ")"
  
        }
    }
}
