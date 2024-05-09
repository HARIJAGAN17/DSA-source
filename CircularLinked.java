package ust;

public class CircularLinked<T> {
    
	Node last;
	class Node{
	     
		T data;
		Node next;
		
		Node(T val){
			data = val;
			next = null;
		}
	}
	CircularLinked(){
		last = null;
	}
	
	public void insert_begin(T val) {
		Node newnode = new Node(val);
		
		if(last==null) {
			newnode.next = newnode;
			last = newnode;
		}
		else {
			newnode.next = last.next;
			last.next = newnode;
		}
	}
	public void insert_end(T val) {
		Node newnode = new Node(val);
		
		if(last==null) {
			newnode.next = newnode;
			last = newnode;
		}
		else {
			newnode.next = last.next;
			last.next = newnode;
			last = newnode;
		}
	}
	public void display() {
		
		if(last==null) {
			System.out.println("list is empty");
			return;
		}
		else {
			Node temp = last.next;
			do {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}while(temp!=last.next);
		}
	}
	public void delete_begin() {
		
		if(last==null) {
			System.out.println("list is empty");
			return;
		}
		else {
			if(last.next==last)
				last = null;
			else
				last.next = last.next.next;
		}
	}
	public void delete_end(){
		
		if(last==null) {
			System.out.println("list is empty");
		}else {
			
			if(last.next==last)
			{
				last = null;
				return;
			}
			else{
			Node temp = last.next;
			
			while(temp.next!=last) {
				temp = temp.next;
			}
			temp.next = last.next;
			last = temp;
			}
		}
	}
	public static void main(String[] args) {

		
		CircularLinked<String> cl = new CircularLinked<>();
		cl.insert_begin("Hari");
		cl.insert_end("Jagan");
		cl.insert_end("2--2");
		cl.display();
		System.out.println();
		cl.delete_end();
		cl.display();
		
		
		

	}

}
