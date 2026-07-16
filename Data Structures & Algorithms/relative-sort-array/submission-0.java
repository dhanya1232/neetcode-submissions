class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int num:arr2){
            set.add(num);
        }
        for(int num:arr1){
            if(!set.contains(num)){
                list.add(num);
            }
        }
        Collections.sort(list);

        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] ans=new int[arr1.length];
        int index=0;

        for(int num:arr2){
            int freq=map.get(num);
            while(freq>0){
                ans[index++]=num;
                freq--;
            }
        }

        for(int num:list){
            ans[index++]=num;
        }
        return ans;
    }
}