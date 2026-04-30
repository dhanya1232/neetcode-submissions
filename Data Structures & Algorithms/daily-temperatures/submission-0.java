class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     int n=temperatures.length;
     int[] result=new int[n];
     Stack<Integer> stack=new Stack<>();
     
     for(int i=0;i<n;i++){
        while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
            int previndex=stack.pop();
            result[previndex]=i-previndex;  //since i is greater than the already existing element in the previndex so when sub it will always be pov
        }
        stack.push(i);
     }
     return result;
    }
}
