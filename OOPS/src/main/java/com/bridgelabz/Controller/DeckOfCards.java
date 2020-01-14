package com.bridgelabz.Controller;

import com.bridgelabz.ServiceImplementation.DeckOfCardsImpl;

public class DeckOfCards {

	public static void main(String[] args)
	{
		DeckOfCardsImpl deckImpl=new DeckOfCardsImpl();
		String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] cardNumbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] deck = new String[52];
		int start = 0, end = 12, k = 0;
		
		// for combination of cardType and cardNumbers
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				deck[j] = cardType[i] + " " + cardNumbers[k];
				k++;
			}
			k = 0;
			start = end + 1;
			end += 13;
		}

		// printing all cards
		for (int i = 0; i < deck.length; i++)
		{
			System.out.println(deck[i] + " ");
		}
		
		// code for shuffle all the cards
		deckImpl.shuffleCardsDeck(deck);
				System.out.println("**************************************");

				// printing cards for 4 players

				int j2 = 0;
				for (int i = 0; i < 4; i++) {
					System.out.print("For Player " + i + ": \n");
					for (int j = 0; j < 9; j++) {

						System.out.print(deck[j2] + "-->");
						j2++;
					}
					System.out.println();
				}
		
	}

}
