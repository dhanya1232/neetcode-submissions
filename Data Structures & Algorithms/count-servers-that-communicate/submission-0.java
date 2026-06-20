class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    boolean hasServer=false;

                    for(int col=0;col<n;col++){
                        if(col!=j && grid[i][col]==1){
                            hasServer=true;
                        }

                    }
                    for(int row=0;row<m;row++){
                        if(row!=i && grid[row][j]==1){
                            hasServer=true;
                        }
                    }
                    if(hasServer)
                    count++;
                }
            }
        }
        return count;
    }

}