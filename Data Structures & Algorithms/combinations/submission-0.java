class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(n,k,1,new ArrayList<>());  //cuz the range says starts from 1
        return ans;
        
    }
    public void backtrack(int n,int k,int start,List<Integer>curr){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));   //creating the obj which was delared in the method initially
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            backtrack(n,k,i+1,curr);
            curr.remove(curr.size()-1);
        }
        
    }
}