package com.bridgelabz.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class UnOrderedList 
{
static String fileData,wordList[];
BufferedReader br;
	class Node<String>
	{
		
		Object data;
		Node<String> next;
		public Node(Object data)
		{
			this.data=data;
		}
	}
	static Node<String> head;
	
	public UnOrderedList()
	{
		/*fileData=Utility.getFileData("D:\\GitBridgelabz\\bridgelabzLocal.data1.txt");
		if(fileData!=null)
			wordList=fileData.split(" ");
		else
			System.out.println("Error while reading file...");*/
		BufferedReader br=Utility.getBufferReaderObject();
		StringBuilder sb=new  StringBuilder();
		try 
		{
			String str=br.readLine();
			while(str!=null)
			{
				sb.append(str);
				str=br.readLine();
			}
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		fileData=sb.toString();
		if(fileData!=null)
			wordList=fileData.split(" ");
		else
			System.out.println("Error while reading file...");
	}
	
	

	public Object del() 
	{
		Object data;
		if(head==null)
		{
			System.out.println("List is Empty..");
			return "";
		}
		Node t=head;
		Node t1=head;
		while(t.next!=null)
		{
			t1=t;
			t=t.next;
		}
		data=t.data;
		t1.next=null;
		return data;
	}
	
	public String toString()
	{
		String str="";
		Node temp;
		temp=head;
		while(temp!=null)
		{
			str=str+temp.data+" ";
			temp=temp.next;
		}
		return str;	
	}
	
	
	public void addWordsInLinkedList(String data)
	{
			Node<String> n=new Node<String>(data);
			if(head==null)
			{
				head=n;
				return;
			}
			Node<String> temp;
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			return;
	}
	
	public static void main(String[] args) 
	{
		UnOrderedList ul=new UnOrderedList();
		for (int i = 0; i < wordList.length; i++) 
		{
			ul.addWordsInLinkedList(wordList[i]);
		}
		System.out.println(ul);
		
		String word;
		System.out.println("Enter the word to search..");
		word=InputScanner.inputWord();
		int rs=findWord(word);
		if(rs==-1)
		{
			System.out.println("No......");			
		}
		else
		{
			System.out.println("Word "+word+" is present in the List...Removed that word from the list");
			removeWordFromList(rs);
		}
	}


	//Remove Word From the List
	public static void removeWordFromList(int pos) 
	{
		Node<String> t=head;
		Node<String> t1=head;
		while(pos>1)
		{
			t1=t;
			t=t.next;
		}
		t1.next=t.next;
		
	}



	public static int findWord(String word)
	{
		int c=0;
		Node<String> temp=head;
		while(temp!=null)
		{
			c++;
			if(temp.data.equals(word))
				return c;
			temp=temp.next;
		}
		return -1;
	}	
}
