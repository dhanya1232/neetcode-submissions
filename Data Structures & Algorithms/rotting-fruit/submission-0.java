class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length; //for column
        int fresh=0;
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int time=0;
        int[][] directions={
            {1,0},
            {-1,0},
            {0,-1},
            {0,1}
        };
        while(!queue.isEmpty() && fresh>0){
           int size=queue.size();
           for(int k=0;k<size;k++){
            int[] current=queue.poll();
            int i=current[0];
            int j=current[1];
            for(int d=0;d<4;d++){
                int ni=i+directions[d][0];
                int nj=j+directions[d][1]; 
                if(ni>=0 && ni<m && nj>=0 && nj<n && grid[ni][nj]==1 ){
                    grid[ni][nj]=2;
                    fresh--;
                    queue.add(new int[]{ni,nj});
                }
            }

           }
           time++;
        }
        if(fresh>0){
            return -1;
        }
        
      return time;  
    }
}
