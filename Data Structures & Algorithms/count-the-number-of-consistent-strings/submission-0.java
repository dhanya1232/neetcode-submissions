class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(char allow:allowed.toCharArray()){
            set.add(allow);
        }
        for(String word:words){
            boolean consistent=true;
            for(char ch:word.toCharArray()){
                if(!set.contains(ch)){
                    consistent=false;
                }
            }
            if (consistent){
                count++;
            }
        }
        return count;
    }
}