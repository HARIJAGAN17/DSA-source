package ust;

public class BinaryTree {
	
	Node root;
	
	class Node{
		Node left;
		Node right;
		int data;
		
		Node(int d)
		{
			data =d;
			left = null;
			right = null;
		}
	}
	
	BinaryTree(int d)
	{
	  root = new Node(d);	
	}
	
	public void insert(int val)
	{
		insert(root,val);
	}
	
	public Node insert(Node root,int val)
	{
		if(root==null)
			return new Node(val);
		
		if(val<root.data)
			root.left = insert(root.left,val);
		else
			root.right = insert(root.right,val);
		
		return root;
	}
	
	public void InOrder(Node root)
	{
		if(root == null)
			return;
		
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
		
	}
	
	public Node search(Node root,int key)
	{
		if(root==null||root.data==key)
			return root;
		
		if(key<root.data)
			return search(root.left,key);
		
		return search(root.right,key);
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree(6);
		bt.insert(4);
		bt.insert(8);
		bt.insert(3);
		bt.insert(5);
		bt.insert(7);
		bt.insert(9);
		bt.InOrder(bt.root);
		
		if(bt.search(bt.root,9)==null)
			System.out.println("Not found");
		else
			System.out.println("Found");
			
	}

}
