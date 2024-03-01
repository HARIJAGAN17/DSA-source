package ust;

public class Queue {
	
	Node front;
	Node rear;
	
	class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data =d;
			next =null;
		}
	}
	
	public void enqueue(int d){
		Node newnode= new Node(d);
		
		if(front==null)
			front = newnode;
		else
			rear.next = newnode;
		rear = newnode;
	}
	
	public int dequeue()
	{
		if(front==null)
			throw new IndexOutOfBoundsException("Queue is empty");
		int temp = front.data;
		front = front.next;
		
		if(front==null)
			rear = null;
		
		return temp;
	}
	
	public boolean isEmpty()
	{
		return front==null;
	}
	
	public int peek()
	{
		if(front==null)
			throw new IndexOutOfBoundsException("Queue is Empty");
		
		return front.data;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
		
		System.out.println(q.peek());
	}

}
