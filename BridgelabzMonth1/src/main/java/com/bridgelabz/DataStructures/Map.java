package com.bridgelabz.DataStructures;

import java.util.ArrayList;

public class Map <K,V>
{
	ArrayList<HashNode<K, V>>arrList=new ArrayList<>();
	int slot=11;
	int size;
	public Map()
	{
		for(int i=0;i<slot;i++)
		{
			arrList.add(null);
		}
	}
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	private int getIndex(K key)
	{
		int hashCode=key.hashCode();
		return hashCode%slot;
	}
	/*public V get(K key)
	{
		int index=getIndex(key);
		HashNode<K, V> head=arrList.get(index);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head=head.next;
		}
		return null;	
	}
	public V remove(K key)
	{
		int index=getIndex(key);
		HashNode<K, V>head=arrList.get(index);
		if(head==null)
		{
			return null;
		}
		if(head.key.equals(key))
		{
			V val=head.value;
			head=head.next;
			arrList.set(index, head);
			size--;
			return val;
		}
		else
		{
			HashNode<K, V>prev=null;
			while(head!=null)
			{
				
				if(head.key.equals(key))
				{
					prev.next=head.next;
					size--;
					return head.value;
				}
				prev=head;
				head=head.next;
			}
			size--;
			return null;
		}
	}*/
	public void add(K key,V value)
	{
		
		int index=getIndex(key);
		//System.out.println(index);
		HashNode<K, V>head=arrList.get(index);
		HashNode<K, V>toAdd=new HashNode<>();
		toAdd.key=key;
		toAdd.value=value;
		if(head==null)
		{
			arrList.set(index, toAdd);
			size++;
			
		}
		else
		{
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				head.value=value;
				size++;
				break;
			}
			head=head.next;
		}
		if(head==null)
		{
		head=arrList.get(index);
		toAdd.next=head;
		arrList.set(index, toAdd);
		size++;
		}
		}
		if((1.0*size)/slot>0.7)
		{
			//do something
			ArrayList<HashNode<K, V>>tmp=arrList;
			arrList=new ArrayList<>();
			slot=2*slot;
			for(int i=0;i<slot;i++)
			{
				arrList.add(null);
			}
			for(HashNode<K, V> headNode:tmp)
			{
				while(headNode!=null)
				{
					add(headNode.key, headNode.value);
					headNode=headNode.next;
				}
			}
			
			
		}
		
	}
	public static void main(String[] args)
	{
		Map<String,Integer>map=new Map<>();
		map.add("A",1 );
		map.add("B",2 );
		map.add("C",3 );
		System.out.println(map.getSize());
		//System.out.println(map.remove("A"));
		System.out.println(map.getSize());
		//System.out.println(map.remove("C"));
		System.out.println(map.getSize());
		System.out.println(map.isEmpty());
		
	}
}
