package ust;

import java.util.*;
class Pair{
    int first;
    int second;
    
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {

    public void dfs(int ro,int co,boolean[][] visited,char[][] grid){

        int n = grid.length;
        int m = grid[0].length;

        Stack<Pair> stack = new Stack<>();
        visited[ro][co] = true;
        stack.add(new Pair(ro,co));
        
        while(!stack.isEmpty()){
            int row = stack.peek().first;
            int col = stack.peek().second;
            stack.pop();

            for(int delrow = -1;delrow<=1;delrow++){
                for(int delcol = -1;delcol<=1;delcol++){
                	 if (Math.abs(delrow) + Math.abs(delcol) != 1) {
                         continue;
                     }
                    int nrow = row+delrow;
                    int ncol = col+delcol;

                    if(nrow>=0 &&  nrow<n && ncol>=0   && ncol<m && grid[nrow][ncol]=='1' && !visited[nrow][ncol] ){ 

                        visited[nrow][ncol] = true;
                        stack.add(new Pair(nrow,ncol));

                    }
                }
            }
        }

    }

    public int numIslands(char[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        int count=0;
        boolean visited[][] = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                if(!visited[i][j] && grid[i][j]=='1'){

                        count++;
                        dfs(i,j,visited,grid);
                }
            }
        }

        return count;

    }
}