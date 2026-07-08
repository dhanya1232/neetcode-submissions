class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map=new HashMap<>();
        ArrayList<String> list=new ArrayList<>();

        for(String a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(String a:arr){
            if(map.get(a)==1){
                list.add(a);
            }
        }
        if(k<=list.size()){
            return list.get(k-1);
        }
        return "";
    }
}