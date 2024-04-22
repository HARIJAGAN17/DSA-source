package ust;

import java.util.ArrayList;

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_list gg = new Graph_list(5);
		gg.addElements(0, 1);
		gg.addElements(0, 3);
		gg.addElements(1, 2);
		gg.addElements(1, 3);
		gg.addElements(2, 4);
		gg.addElements(3, 4);
		
		gg.display();
	}

}
