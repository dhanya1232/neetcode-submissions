class Solution {
    public String decodeString(String s) {
       Stack<Integer> countStack=new Stack<>();
       Stack<String> stringStack=new Stack<>();
        
       int num=0;
       String curr="";

       for(char ch:s.toCharArray()){
           if(Character.isDigit(ch)){
             num=num*10+(ch-'0');
           }else if(ch=='['){
            countStack.push(num);
            stringStack.push(curr);
            curr="";
            num=0;
           }else if(ch==']'){
             int repeat=countStack.pop();
             StringBuilder decodedstring=new StringBuilder(stringStack.pop());
             for(int i=0;i<repeat;i++){
                decodedstring.append(curr);
             }
             curr=decodedstring.toString();
           }else{
            curr=curr+ch;
           }

       }
       return curr;
    }
}