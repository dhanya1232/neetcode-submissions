class Solution {
    public List<String> stringMatching(String[] words) {
       List<String> ans=new ArrayList<>();

       for(int i=0;i<words.length;i++){
        for(int j=0;j<words.length;j++){
            if(i!=j && words[j].contains(words[i])){  ///i!=j cuz mass is for i and j but since both are equal it shouldnt be added in the ans list 
                ans.add(words[i]);
                break;  //for few test cases it is telling time exceeded 
            }
        }
       } 
       return ans;
    }
}