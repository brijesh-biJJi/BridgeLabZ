package com.bridgelabz.DataStructures;

public class LinkedList<T> 
{
	Node<T> head;
	public Object deleteAt;
	int size = 0;

	
	public void add(T data) 
	{
		Node<T> nodenew = new Node<T>(data);
		if (head == null)
		{
			head = nodenew;
			size++;
		}

		else 
		{
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = nodenew;
			size++;
		}
	}
	
	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> n = head;
			Node<T> n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
//			System.out.println("Node deleted is: " + n1.data);
			n1 = null;
		}
		size--;

	}
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

}
