package ust;

public class Double_list {
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d)
		{
			data = d;
			next = null;
			prev = null;
		}
	}
	
	public void insert_begin(int d)
	{
		Node newnode = new Node(d);
		
		newnode.next = head;
		if(head ==null)
		{
			tail = newnode;
		}
		else
		{
			head.prev = newnode;
		}
		head = newnode;
	}
	public void insert_pos(int d,int pos)
	{
		if(pos==0)
		{
			insert_begin(d);
			return;
		}
		
		Node newnode = new Node(d);
		
		Node temp = head;
		
		for(int i=1;i<pos;i++)
		{
			temp = temp.next;
			if(temp==null)
				throw new IllegalArgumentException("invalid pos");
		}
		newnode.next = temp.next;
		newnode.prev = temp;
		
		
		if(temp == tail)
		{
			tail = newnode;
		}
		else
		temp.next.prev = newnode;
		
		temp.next = newnode;
	}
	public void delete_begin()
	{
		head = head.next;
		if(head == null)
		{
			tail = null;
		}
		else {
			head.prev = null;
		}
	}
	public void delete_pos(int pos)
	{
		if(pos==0)
		{
			delete_begin();
			return;
		}
		
		Node temp = head;
		Node prev = null;
		for(int i=1;i<=pos;i++)
		{
			prev = temp;
			temp = temp.next;
			if(temp == null)
				throw new IllegalArgumentException("invalid pos");
		}
		prev.next = temp.next;
		if(temp.next == null)
		{
			tail = prev;
		}
		else
		temp.next.prev = prev;
		
		
	}
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-");
			temp = temp.next;
		}
	}
	public void reverse()
	{
		Node temp = tail;
		while(temp!=null)
		{
			System.out.print(temp.data+"<->");
			temp = temp.prev;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double_list l = new Double_list();
		l.insert_begin(3);
		l.insert_begin(2);
		l.insert_begin(1);
		l.insert_pos(55, 3);
		l.insert_pos(66, 4);
		l.delete_pos(4);
		
		l.display();
		

	}

}
