class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set=new HashSet<>();
        int x=0, y=0;
        set.add("0,0");
        for(char ch:path.toCharArray()){
            if(ch=='N'){
                y++;
            }else if(ch=='S'){
                y--;
            }else if(ch=='E'){
                x++;
            }else{
                x--;
            }
            String position=x+","+y;
            if(set.contains(position)){
                return true;
            }
            set.add(position);
        }
        return false;
    }
}