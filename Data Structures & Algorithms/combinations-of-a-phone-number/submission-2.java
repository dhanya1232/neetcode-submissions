class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,0,"",result,map);
        return result;
    }
    public void backtrack(String digits, int index, String curr, List<String> result,String[] map){
        if(index==digits.length()){
            result.add(curr);
            return;  //without return, Java continues to the next line
        }
        int digit=digits.charAt(index)-'0';
        String letters=map[digit];
        for(int i=0;i<letters.length();i++){
        curr = curr + letters.charAt(i);
        backtrack(digits, index + 1, curr, result, map);
        curr = curr.substring(0, curr.length() - 1);
        }
    }
}
