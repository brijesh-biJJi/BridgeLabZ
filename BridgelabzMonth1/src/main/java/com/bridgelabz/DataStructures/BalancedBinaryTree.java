package com.bridgelabz.DataStructures;

import com.bridgelabz.DataStructures.QueueUsingLinkedList.Node;

public class BalancedBinaryTree 
{
		//Node class is Used to create a Node
		class Node
		{
			Object data;
			Node right,left;
			Node(Object data)
			{
				this.data=data;
			}
		}
		static Node root;
		
		//Add method is used to add the Node to the Tree
		public boolean add(Object data)
		{
			Node n=new Node(data);
			Comparable c=(Comparable)data;
			if(root==null)
			{
				root=n;
				return true;
			}
			Node t=root;
			while(true)
			{
				if(c.compareTo(t.data)>0)
				{
					if(t.right==null)
					{
						t.right=n;
						break;
					}
					t=t.right;
				}
				else if(c.compareTo(t.data)<0)
				{
					if(t.left==null)
					{
						t.left=n;
						break;
					}
					t=t.left;
				}
				else
					return false;
			}
			return true;
		}
		
		//toString method is used to return the element present in the list
				/*public String toString()
				{
					String str="";
					Node temp;
					temp=root;
					while(temp!=null)
					{
						str=str+temp.data;
						if(temp.next!=null)
							str=str+"->";
						temp=temp.next;
					}
					return str;
				}*/
		
		
		//A utility function to do PreOrder traversal of BST
		void preOrder(Node root)
		{
			if(root!=null)
			{
				System.out.println(root.data);
				preOrder(root.left);
				preOrder(root.right);
			}
		}
		
		
		
		
		
		// This method mainly calls InorderRec() 
		void inOrder()  
		{ 
	       inorderRec(root); 
		} 
		  
		// A utility function to do inorder traversal of BST 
		void inorderRec(Node root) 
		{ 
	        if (root != null) 
	        { 
	        	inorderRec(root.left); 
	        	System.out.println(root.data); 
	        	inorderRec(root.right); 
		    } 
	    } 
		
		
		//A utility function to do PostOrder traversal of BST
		void postOrder(Node root)
		{
			if(root!=null)
			{
				preOrder(root.left);
				preOrder(root.right);
				System.out.println(root.data);
			}
		}
				
		
		//search() method is used to search the element is present or not
		public Object searchNode(Node root,Object data)
		{
			Comparable c=(Comparable)data;
			if(root==null || (root.data==data))
				return root;
			if(c.compareTo(root.data)<0)
				return searchNode(root.left,data);
			
			return searchNode(root.right,data);
		}
 		
		//main method to run the program
		public static void main(String[] args) 
		{
			BalancedBinaryTree bst=new BalancedBinaryTree();
			bst.add(23);
			bst.add(35);
			bst.add(15);
			bst.add(43);
			bst.add(28);
			bst.add(18);
			bst.add(43);
			System.out.println("PreOrder Traversal..");
			bst.preOrder(root);
			System.out.println("InOrder Traversal..");
			bst.inOrder();
			System.out.println("PostOrder Traversal..");
			bst.postOrder(root);
			
			Object rs=bst.searchNode(root,28);
				System.out.println("Yess "+rs);
		}
}
