package com.bridgelabz.DataStructures;

public class PrimeAnagramStackUsingLinkedList extends PrimeAnagramTwoDimensionalArray
{

	public static void main(String[] args) 
	{
		LinkedListUtility llu=new LinkedListUtility();
		/*llu.addLast("abc");
		llu.addLast("def");
		llu.addLast("ghi");
		
		for(int i=0;i<primeArray.length;i++)
		{
			for (int j = 0; j < primeArray[i].length; j++) 
			{
				llu.addLast(primeArray[i][j]);
			}
		}*/
		
		for(int i=0;i<primeArray.length;i++)
		{
			for (int j = 0; j < primeArray[i].length; j++) 
			{
				System.out.println(primeArray[i][j]);
			}
		}
		
		System.out.println(llu);
		//System.out.println(llu.deleteLast());
		//System.out.println(llu);
		llu.reverseList();
		System.out.println(llu);
	}

}
