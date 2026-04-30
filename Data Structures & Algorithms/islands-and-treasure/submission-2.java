class Solution {
    
    public void islandsAndTreasure(int[][] grid) {

        int rows=grid.length;
        int col=grid[0].length;

        Set<String> visited=new HashSet<>();
        Queue<int[]> q=new LinkedList<>();
        for(int r=0;r<rows;r++){
            for(int c=0;c<col;c++){
                if(grid[r][c]==0){
                    q.offer(new int[]{r,c});
                    visited.add(r+","+c);
                }
            }
        }
        int dist=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cell=q.poll();
                int r=cell[0];
                int c=cell[1];
                grid[r][c]=dist;
                addRoom(r+1,c,grid,visited,q);
                addRoom(r-1,c,grid,visited,q);
                addRoom(r,c+1,grid,visited,q);
                addRoom(r,c-1,grid,visited,q);
            }
        dist++;
        }
    }
        private void addRoom(int r,int c,int[][] rooms, Set<String> visited, Queue<int[]> q){
            int rows=rooms.length;
            int col=rooms[0].length;

            if(r<0 || c<0 || r>=rows || c>=col || rooms[r][c]==-1 )
            return;
            if(visited.contains(r+","+c))
            return;
            q.offer(new int[]{r,c});
            visited.add(r+","+c);
        }
    }

