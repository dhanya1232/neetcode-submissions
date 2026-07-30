class Solution {
    List<String> ans=new ArrayList<>();
    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {  //finding all possible combination -so  use backtracking
         if(digits.length()==0){
            return ans;
         }
         backtrack(digits,0,new StringBuilder());
         return ans;
          
    }
    public void backtrack(String digits,int index,StringBuilder curr){
        if(index==digits.length()){
            ans.add(curr.toString());
            return;
        }
        int digit=digits.charAt(index)-'0';
        String letters=map[digit];
        for(int i=0;i<letters.length();i++){
            curr.append(letters.charAt(i));
            backtrack(digits,index+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}

//String → creates a new object every time you add a character.
//StringBuilder → modifies the same object, so it's ideal for backtracking where you repeatedly add and remove characters
