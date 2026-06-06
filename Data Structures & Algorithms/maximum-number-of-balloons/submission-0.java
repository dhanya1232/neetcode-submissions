class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(char t:text.toCharArray()){
            if(t=='b')b++;
            else if(t=='a')a++;
            else if(t=='l')l++;
            else if(t=='o')o++;
            else  if(t=='n')n++;
        }
        return Math.min(Math.min(a,b),Math.min(Math.min(l/2,o/2),n));

    }
}