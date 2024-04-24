package ust;

import java.util.LinkedList;

class Pair{

    int first;
    int second;
    int time;

    Pair(int first,int second,int time){
        this.first = first;
        this.second = second;
        this.time = time;
    }
}

class Solution {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        
        Queue<Pair> q = new LinkedList<>();
        int visited[][] = new int[n][m];
        int countFresh =0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j] =2;
                }
                else{
                    visited[i][j] =0;
                }

                if(grid[i][j]==1)
                countFresh++;

            }
        }

        int count =0;
        int countTime =0;
        while(!q.isEmpty()){

            int cr = q.peek().first;
            int cc = q.peek().second;
            int ct = q.peek().time;
            countTime = Math.max(ct,countTime);
            q.remove();

            for(int i=0;i<4;i++){
                
                int nr = cr+dx[i];
                int nc = cc+dy[i];

                if(nr>=0 && nr<n && nc>=0 && nc<m && visited[nr][nc]==0 && grid[nr][nc]==1){
                    count++;
                    q.add(new Pair(nr,nc,ct+1));
                    visited[nr][nc] = 2;
                }
            }
        }

        if(count!=countFresh)
        return -1;

        return countTime;




        
    }
}