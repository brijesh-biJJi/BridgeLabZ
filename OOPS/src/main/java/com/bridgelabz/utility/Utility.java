package com.bridgelabz.utility;

import java.util.Random;

public class Utility 
{
	/**
	 * Initializes the 2-D String array.
	 * @param deck
	 * @param suits
	 * @param ranks
	 */
	public static void InitializeArray(String[][] deck, String[] suits, String[] ranks)
	{
		for (int i = 0; i < suits.length; i++) 
		{
			for (int j = 0; j < ranks.length; j++)
			{
				deck[i][j]=suits[i]+"-"+ranks[j];
			}
		}
	}
	
/*	
	/**
	 * Generates the Random Number
	 */
/*	public static int GenerateRandom(int max)
    {
        Random random = new Random();
        return random.nextInt(max);
    }
	
	
	/**
	 * Shuffles the specified array.
	 * @param deck
	 */
/*	public static void Shuffle(String[][] deck) 
	{
		 int rowIndex1 = 0;
         int ColumnIndex1 = 0;
         int rowIndex2 = 0;
         int ColumnIndex2 = 0;

         for(int i=0;i<52;i++)
         {
             rowIndex1 = GenerateRandom(4);
             ColumnIndex1 = GenerateRandom(13);
             rowIndex2 = GenerateRandom(4);
             ColumnIndex2 = GenerateRandom(13);
             ////call the swap method to swap the elements of array
             Swap(deck,rowIndex1, ColumnIndex1, rowIndex2, ColumnIndex2);
         }
	}


	public static void Swap(String[][] deck, int rowIndex1, int columnIndex1, int rowIndex2, int columnIndex2) 
	{
		
	}*/

}
