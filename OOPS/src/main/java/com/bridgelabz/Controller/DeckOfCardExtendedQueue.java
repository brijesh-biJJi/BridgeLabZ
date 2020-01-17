package com.bridgelabz.Controller;

import com.bridgelabz.DeckOfCardsExtendedQueue.ListNodePlayer;
import com.bridgelabz.DeckOfCardsExtendedQueue.QueuePlayer;
import com.bridgelabz.utility.Utility;

/**
 * Deck Of Card extended using DeckOfCardExtendedQueue Class.
 * @author user
 *
 */
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
		
		/**
		 * Add 4 player into Queue
		 */
		Utility.addPlayersInQueue(queuePlayer);
		
		/**
		 * Distribute the cards in the DecksOfCard array to all the players in the queue.
		 */
		Utility.distributeCards(queuePlayer,deck);
		
		/**
		 * Print the entire queue.
		 */
		Utility.printPlayerQueue(queuePlayer);
		
	}

}
