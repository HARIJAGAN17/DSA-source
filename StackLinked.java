package ust;

public class StackLinked {
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int x){
			data = x;
			next = null;
		}
	}
	
	public void push(int x) {
		Node newnode = new Node(x);
		
		if(head==null)
		{
			head=newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	public int peek() {
		
		return head.data;
	}
	
	public void pop() {
		if(head==null) {
			System.out.println("Stack is empty");
		}else {
			head = head.next;
		}
	}
	
	public void display() {
		
		Node temp = head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
	
		StackLinked s1 = new StackLinked();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.display();
		s1.pop();
		System.out.println("After popping");
		s1.display();
		System.out.println("Check empty");
		s1.pop();
		s1.pop();
		s1.pop();

	}

}
