package ust.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

class Pair{
    
    int node;
    int parent;
    
    Pair(int node,int parent){
        this.node = node;
        this.parent = parent;
    }
}

class Solution {
    // Function to detect cycle in an undirected graph.
    
    public boolean bfs(int start,boolean[] visited,ArrayList<ArrayList<Integer>> adj){
        
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start,-1));
        visited[start] = true;
        
        
        while(!q.isEmpty()){
            
            int node = q.peek().node;
            int parent = q.peek().parent;
            q.remove();
            
            for(int adjacent : adj.get(node)){
                
                if(visited[adjacent]==false){
                    visited[adjacent]=true;
                    q.add(new Pair(adjacent,node));
                }
                else if(parent!=adjacent){
                    return true;
                }
            
            }
        }
        return false;
    }
     
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        boolean visited[] = new boolean[V];
        
        for(int i=0;i<V;i++){
            
           if(visited[i]==false){
               if( bfs(i,visited,adj))
               return true;
           }
        }
        return false;
    }
}