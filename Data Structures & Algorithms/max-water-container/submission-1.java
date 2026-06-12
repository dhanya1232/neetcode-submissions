class Solution {
    public int maxArea(int[] heights) {  //the values r given in the form of array
      int i=0;
      int j=heights.length-1;  //length is used for array whereas length() is used for strings n its a method 
      int maxarea=0;
      while(i<j){
        int height=Math.min(heights[i],heights[j]);
        int width=j-i;
        int area=height*width;

        maxarea=Math.max(area,maxarea);
        
       
      if(heights[i]<heights[j]){   //using this to check every i with all the remaining numbers
      i++;
      }else{
      j--;
      }
      }
      return maxarea;
    }
}
