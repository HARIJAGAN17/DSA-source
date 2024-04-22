package ust;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph_list {
	
	ArrayList<ArrayList<Integer>> gr = new ArrayList<>();
	
	
	public Graph_list(int v) {
		
		for(int i=0;i<v;i++) {
			gr.add(new ArrayList<Integer>());
		}
	}
	
	public void addElements(int u,int v) {
		gr.get(u).add(v);
		gr.get(v).add(u);
	}
	
	public void display() {
		for(int i=0;i<gr.size();i++) {
			System.out.println("Vertices of: "+i);
			for(int j=0;j<gr.get(i).size();j++) {
				System.out.println(gr.get(i).get(j));
			}
		}
	}
	
	public void bfs(int v) {
		
		Queue<Integer> q = new LinkedList<>();
		
		boolean visited[] = new boolean[gr.size()];
		
		q.add(v);
		visited[v] =true;
		
		while(q.size()!=0) {
			
			int vertex = q.remove();
			System.out.print(vertex+" ");
			for(int i=0;i<gr.get(vertex).size();i++) {
				
				int av = gr.get(vertex).get(i);
				
				if(visited[av]==false) {
					q.add(av);
					visited[av]=true;
				}
				
			}
		}
	}
		public void dfs(int v) {
		
		Stack<Integer> ss = new Stack<>();
		
		boolean visited[] = new boolean[gr.size()];
		
		ss.add(v);
		visited[v] =true;
		
		while(ss.size()!=0) {
			
			int vertex = ss.pop();
			System.out.print(vertex+" ");
			for(int i=0;i<gr.get(vertex).size();i++) {
				
				int av = gr.get(vertex).get(i);
				
				if(visited[av]==false) {
					ss.add(av);
					visited[av]=true;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_list gg = new Graph_list(5);
		gg.addElements(0, 1);
		gg.addElements(0, 3);
		gg.addElements(1, 2);
		gg.addElements(1, 3);
		gg.addElements(2, 4);
		gg.addElements(3, 4);
		gg.bfs(0);
		System.out.println();
		gg.dfs(0);
		
	}

}
