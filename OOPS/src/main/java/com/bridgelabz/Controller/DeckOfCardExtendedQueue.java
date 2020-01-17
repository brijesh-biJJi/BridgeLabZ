package com.bridgelabz.Controller;

import com.bridgelabz.DeckOfCardsExtendedQueue.QueuePlayer;
import com.bridgelabz.utility.Utility;

public class DeckOfCardExtendedQueue 
{

	public static void main(String[] args)
	{
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	
		String[][] deck=new String[4][13];
		String[][] player=new String[4][9];
		
		/**
		 * Initialise the array to store all the cards 
		 */
		Utility.InitializeArray(deck, suits, ranks);
		
		/**
		 * Shuffle the deck of cards
		 */
		Utility.shuffle(deck);
		
		/**
		 * Create the Queue to hold all the players
		 */
		QueuePlayer queuePlayer = Utility.CreateQueuePlayer();
		
		
	}

}
