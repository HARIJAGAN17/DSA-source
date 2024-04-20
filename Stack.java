package ust;

public class Stack {
	
	int size;
	int top;
	int arr[];
	
	Stack(int n)
	{
		top = -1;
		size = n;
		arr = new int[size];
	}
	
	public void push(int d)
	{
		if(top==size-1)
			throw new IndexOutOfBoundsException("stack is Full");
		arr[++top] =d;
	}
	public int pop()
	{
		if(isEmpty())
			throw new IndexOutOfBoundsException("stack is empty");
	  return arr[top--];
	}
	public int peek()
	{
		return arr[top];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack s = new Stack(5);
			s.push(5);
			s.push(4);
			s.push(3);
			s.push(2);
			s.push(1);
			System.out.println(s.peek());
	}

}
