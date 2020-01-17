package com.bridgelabz.utility;

import java.util.Random;

import com.bridgelabz.DeckOfCardsExtendedQueue.ListNodePlayer;
import com.bridgelabz.DeckOfCardsExtendedQueue.Player;
import com.bridgelabz.DeckOfCardsExtendedQueue.QueueCard;
import com.bridgelabz.DeckOfCardsExtendedQueue.QueuePlayer;

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
	
	
	/**
	 * Generates the Random Number
	 */
	public static int GenerateRandom(int max)
    {
        Random random = new Random();
        return random.nextInt(max);
    }
	
	
	/**
	 * Shuffles the specified array.
	 * @param deck
	 */
	public static void shuffle(String[][] deck) 
	{
		 int r1 = 0;
         int c1 = 0;
         int r2 = 0;
         int c2 = 0;

         for(int i=0;i<52;i++)
         {
             r1 = GenerateRandom(4);
             c1 = GenerateRandom(13);
             r2 = GenerateRandom(4);
             c2 = GenerateRandom(13);
             ////call the swap method to swap the elements of array
             swap(deck,r1, c1, r2, c2);
         }
	}

	/**
	 * Swaps the specified elements of array.
	 * @param deck
	 * @param r1
	 * @param c1
	 * @param r2
	 * @param c2
	 */
	public static void swap(String[][] deck, int r1, int c1, int r2, int c2) 
	{
		String temp=deck[r1][c1];
		deck[r1][c1]=deck[r2][c2];
		deck[r2][c2]=temp;
	}


	/**
	 * Creates the queue for players.
	 * @return
	 */
	public static QueuePlayer CreateQueuePlayer() 
	{
		QueuePlayer queuePlayer=new QueuePlayer();
		queuePlayer.front=null;
		queuePlayer.rear=null;
		return queuePlayer;
	}

	/**
	 * Creates the Queue for cards
	 * @return
	 */
	public static QueueCard createQueuecard() 
	{
		QueueCard queueCard=new QueueCard();
		queueCard.front=null;
		queueCard.rear=null;
		return queueCard;
	}

	/**
	 * Adds Players in Queue
	 * @param queuePlayer
	 */
	public static void addPlayersInQueue(QueuePlayer queuePlayer)
	{
		for (int i = 0; i < 4; i++)
		{
			Player playerObj=new Player();
			addPlayer(queuePlayer,playerObj);
		}
	}

	/**
	 * Add each players in the Queue
	 * @param queuePlayer
	 * @param player
	 */
	public static void addPlayer(QueuePlayer queuePlayer, Player playerObj)
	{
		ListNodePlayer playerNode=new ListNodePlayer();
		playerNode.data=playerObj;
		
		if(queuePlayer.rear==null)
			queuePlayer.rear=playerNode;
		else
		{
			queuePlayer.rear.next=playerNode;
		}
		
	}


	

}
