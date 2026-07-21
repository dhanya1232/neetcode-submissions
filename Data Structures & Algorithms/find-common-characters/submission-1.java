class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:words[0].toCharArray()){   //find freq for the first word only
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=1;i<words.length;i++){  //freq for words except the first one
            HashMap<Character,Integer> curr=new HashMap<>();
            for(char ch:words[i].toCharArray()){
                curr.put(ch,curr.getOrDefault(ch,0)+1);
            }
        

        for(char ch:map.keySet()){  //compare both the maps to find char wid same freq
            if(curr.containsKey(ch)){
                map.put(ch,Math.min(curr.get(ch),map.get(ch)));
            }else{
                map.put(ch,0);
            }
        }
        }

        List<String> ans=new ArrayList<>();  //ans should be in the form of list

        for(char ch:map.keySet()){
            int freq = map.get(ch);
            while(freq>0){
                ans.add(String.valueOf(ch));
                freq--;
            }
        }
        return ans;

    }
}