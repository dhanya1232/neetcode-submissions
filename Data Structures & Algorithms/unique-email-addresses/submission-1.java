class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        for(String email:emails){
            String[] part=email.split("@");
            String local=part[0];
            String domain=part[1];

            int lastindex=local.indexOf("+");
            if(lastindex!=-1){
                local=local.substring(0,lastindex);
            }
            local=local.replace(".","");
            set.add(local+"@"+domain);
        }
       return set.size();
    }
}