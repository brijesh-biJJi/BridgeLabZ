package com.bridgelabz.DataStructures;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.bridgelabz.DataStructures.Node;
import com.bridgelabz.utility.Utility;

//LinkedList Utility class contains the Utility methods which can be made use in UnOrderedList class
public class LinkedListUtility <T>
{
BufferedReader br;
	
	//Collecting the data from the file data1.txt
	public String getWordFromTheList()
	{
		BufferedReader br=Utility.getBufferReaderObject();
		StringBuilder sb=new  StringBuilder();
		try 
		{
			String str=br.readLine();
			while(str!=null)
			{
				//Appending the data
				sb.append(str);
				str=br.readLine();
			}
		} 
		catch (IOException e) 
		{
			System.out.println("Error in reading the file...");;
		}
		finally{
			try {
				br.close();
			} catch (IOException e) 
			{
				System.out.println(e);;
			}
		}
		return sb.toString();
	
	}
	
	
	Node<T> head;
	
	//addWordsInLinkedList method is used to add Nodes into the Linked List
	public void addWordsInLinkedList(T data)
	{
			Node<T> n=new Node<>(data);
			if(head==null)
			{
				head=n;
				return;
			}
			Node<T> temp;
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			return;
	}
	
	//addWordsIntoListInAscendingOrder() method is used to add the Nodes in the Ascending Order
	public void addWordsIntoListInAscendingOrder(T data)
	{
		Comparable c=(Comparable)data;
		Node<T> n=new Node<>(data);
		
		Node<T> temp = head;
		if(head == null)
        {
            head = n;
            return;
        }
        else
        {
       
            if(c.compareTo(head.data)<0)
            {
                n.next = head;
                head = n;
            }
            else
            {
                temp = head;
                while(temp.next != null)
                {
                    if(c.compareTo(temp.next.data)<0)
                    {
                        n.next = temp.next;
                        temp.next = n;
                        break;
                    }
                    temp = temp.next;
                }
                temp.next = n;
            }
            
       }
	}
	
	
	
	
	//removeWordFromList method is used to Remove Word From the Linked List
	public void removeWordFromList(int in) 
	{
		Node<T> t=head;
		if(in==0)
		{
			head=head.next;
		}
		while(in>1)
		{
			t=t.next;
			in--;
		}
		t.next=t.next.next;
	}


	//findWord method is used to find the word present in the List
	/*public int findWord(T word)
	{
		int c=0;
		Node<T> temp=head;
		while(temp!=null)
		{
			c++;
			if(temp.data.equals(word))
				return c;
			temp=temp.next;
		}
		return -1;
	}	*/
	
	public int findWord1(T word)
	{
		int c=0;
		Comparable comp=(Comparable)word;
		Node<T> temp=head;
		while(temp!=null)
		{
			c++;
			if(comp.compareTo(temp.data)==0 )
				return c;
			temp=temp.next;
		}
		return -1;
	}	
	
		
	//displayLinkedList is used to Display the Element present in the List	
	public void displayLinkedList()
	{
		Node<T> temp;
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			if(temp.next!=null)
				System.out.print("->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	////saveToFile is used to save the data into the file
	public void saveToFile()
	{
		String data=getData();
		//File file=new File("wordList.txt");
		try 
		{
			//FileOutputStream fs=new FileOutputStream("wordList1.txt");
			//ObjectOutputStream oos=new ObjectOutputStream(fs);
			//oos.writeObject(data);
			File f=new File("wordList1.txt");
			if(!f.exists())
				f.createNewFile();
			FileWriter fw=new FileWriter(f);
			fw.write(data);
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

    //getData method is used to get the data from the List
	public String getData() 
	{
		String str="";
		Node<T> temp;
		temp=head;
		while(temp!=null)
		{
			str=str+temp.data+" ";
			temp=temp.next;
		}
		return str;
	}
	
	
	/**
	 * Hashing Function Utilities
	 */
	//Returns the Index to store the value in HashTable
	public int getIndex(int num)
	{
		return num%11;
	}
	
	//findValue method is used to check value is present or not
	//As it returns the Boolean True Or False
	public boolean findValue(Node<T> head,int num)
	{
		Comparable c=(Comparable)num;
		if(head==null)
			return false;
		Node<T> temp=head;
		while(temp!=null)
		{
			if(c.compareTo(temp.data)==0)
				return true;
			temp=temp.next;
		}
		return false;
	}
	
	//Adding the Value InOrder into the HAshTable
	public Node<T> addValueInOrder(Node<T> head,int data)
	{
		Comparable c=(Comparable)data;
		Node<T> n=new Node<T>((T) c);
		
		Node<T> temp = head;
		if(head == null)
        {
            head = n;
            return head;
        }
        else
        {
       
            if(c.compareTo(head.data)<0)
            {
                n.next = head;
                head = n;
            }
            else
            {
                temp = head;
                while(temp.next != null)
                {
                    if(c.compareTo(temp.next.data)<0)
                    {
                        n.next = temp.next;
                        temp.next = n;
                        break;
                    }
                    temp = temp.next;
                }
                temp.next = n;
            }
            
       }
		return head;
		
	}
	
	//MEthod is used to Print the Node present inside HashTable
	public void printHashTableValue(Node<T> head)
	{
		Node<T> temp=head;
		if(temp==null)
			System.out.print("None");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	 
}
