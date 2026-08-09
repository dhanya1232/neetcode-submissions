class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        
            for(char ch:chars.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            int count=0;
            for(String word:words){
                HashMap<Character,Integer> temp=new HashMap<>(map);
                boolean found=true;

                for(char w:word.toCharArray()){
                    if(!temp.containsKey(w) || temp.get(w)==0){
                        found=false;
                    }else{
                    temp.put(w,temp.get(w)-1);
                    }
                }
                if (found){
                    count+=word.length();
                }
            }
            return count;
        
    }
}