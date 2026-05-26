class Solution {
    public int countSeniors(String[] details) {
        int count=0;
       for(String d:details){
        String str= d.substring(11,13);
        int age=Integer.parseInt(str);
        if(age>60){
            count++;
        }
       } 
       return count;
    }
}