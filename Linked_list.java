package ust;

public class Linked_list {
	
	Node head;
	
	class Node{
		
		Node next;
		int data;
		
		Node(int d)
		{
			data =d;
			next = null;
		}
	}
	
	public void insert_begin(int d)
	{
		Node newnode = new Node(d);
		
		if(head==null)
			head = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	public void insert_at_pos(int d,int pos)
	{
		Node newnode  = new Node(d);
		
		if(pos==0)
		{
			insert_begin(d);
			return;
		}
		
		Node temp = head;
		for(int i=1;i<pos;i++)
		{
			temp = temp.next;
			if(temp==null)
				throw new IllegalArgumentException("invalid pos");
			
			newnode.next = temp.next;
			temp.next = newnode;
		}
	}
	
	public void delete_begin()
	{
		if(head==null)
			throw new IndexOutOfBoundsException("invalid null");
		
		head = head.next;
	}
	
	public void delete_pos(int pos)
	{
		Node prev = null;
		Node temp = head;
		
		if(pos==0)
		{
			delete_begin();
			return;
		}
			
		for(int i=1;i<=pos;i++)
		{
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}
	
	public void reverse()
	{
		
		Node prev = null;
		Node curr = head;
		Node next = curr.next;
		
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public void display()
	{
		Node temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linked_list l = new Linked_list();
		l.insert_begin(0);
		l.insert_begin(1);
		l.insert_begin(2);
		l.insert_begin(3);
		l.insert_begin(4);
		//l.insert_at_pos(4, 2);
		l.delete_pos(4);
		l.display();
		l.reverse();
		System.out.println();
		l.display();
	}

}
