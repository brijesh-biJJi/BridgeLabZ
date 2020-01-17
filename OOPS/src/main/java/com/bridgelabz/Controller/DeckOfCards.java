package com.bridgelabz.Controller;

import java.util.Random;

import com.bridgelabz.ServiceImplementation.DeckOfCardsImpl;

public class DeckOfCards {

	public static void main(String[] args)
	{
		Random rd=new Random();
		DeckOfCardsImpl deckImpl=new DeckOfCardsImpl();
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	
		String[][] deck=new String[4][13];
		String[][] player=new String[4][9];
		
		for (int i = 0; i < suit.length; i++) 
		{
			for (int j = 0; j < rank.length; j++)
			{
				deck[i][j]=suit[i]+"-"+rank[j];
			}
		}
		
		
		/**
		 * Loop is to Shuffle the card
		 */
		for (int i = 0; i < 52; i++) {
			int r1,c1,r2,c2;
			r1=rd.nextInt(4);
			c1=rd.nextInt(13);
			r2=rd.nextInt(4);
			c2=rd.nextInt(13);
			deckImpl.shuffleCardsDeck(deck,r1,c1,r2,c2);
		}
		System.out.println("\n***************************************************");
		System.out.println("Printing the Deck of Card after Shuffling the Deck.....");
		/**
		 * PRinting the Deck od card
		 */
		for (int i = 0; i < suit.length; i++) 
		{
			for (int j = 0; j < rank.length; j++)
			{
				System.out.println(deck[i][j]);
			}
		}
		
		
		/**
		 * Distributing 9Cards to 4 player
		 */
		
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 9; j++)
			{
				player[i][j]=deck[i][j];
			}
		}
		
		System.out.println("\n***************************************************");
		System.out.println("Distributing 9Cards to 4 player.....");
		/**
		 * PRinting the Deck of card
		 */
		for (int i = 0; i < 4; i++) 
		{
			System.out.println("\nPlayer : "+(i+1));
			System.out.println("**********");
			for (int j = 0; j < 9; j++)
			{
				System.out.println(player[i][j]);
			}
		}
	}
}
