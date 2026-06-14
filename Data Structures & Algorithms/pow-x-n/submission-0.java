class Solution {
    public double myPow(double x, int n) {
        double res=1;
        int power=Math.abs(n);
        for(int i=0;i<power;i++){
            res=res*x;
        }
        if(n<0){
            return 1/res;
        }
        return res;
    }
}
