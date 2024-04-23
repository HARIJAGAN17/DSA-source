package ust;

import java.util.ArrayList;
import java.util.Stack;

public class Graph_numberOfProvinces {
	
	
	int v;
	ArrayList<ArrayList<Integer>> li;
	
	
	
	
	
	public Graph_numberOfProvinces(int v) {
		this.v = v;
		li = new ArrayList<>();
		
		for(int i=0;i<v;i++) {
			li.add(new ArrayList<Integer>());
		}
	}
	
	
	public void addEdge(int u,int v) {
		
		li.get(u).add(v);
		li.get(v).add(u);
	}
	
	
	public int numberOfProvinces(){
		
		boolean visited[] = new boolean[v];
		int numberof=0;
		for(int i=1;i<v;i++) {
			if(!visited[i]) {
				numberof++;
				dfs(i,visited);
			}
		}
		return numberof;
		
	}
	
	
	public void dfs(int start,boolean[] visited) {
				
		Stack<Integer> ss= new Stack<>();
		visited[start] =true;
		ss.add(start);
		
		while(!ss.isEmpty()) {
			
			int vertex = ss.pop();
			
			for(int i=0;i<li.get(vertex).size();i++) {
				
				int av = li.get(vertex).get(i);
				
				if(!visited[av]) {
				ss.add(av);
				visited[av] = true;
				}
			}
		}
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_numberOfProvinces gg = new Graph_numberOfProvinces(9);
		gg.addEdge(1, 2);
		gg.addEdge(2, 3);
		gg.addEdge(4, 5);
		gg.addEdge(5, 6);
		gg.addEdge(7, 8);
		System.out.println(gg.numberOfProvinces());

	}

}
