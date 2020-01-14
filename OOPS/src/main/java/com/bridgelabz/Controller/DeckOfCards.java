package com.bridgelabz.Controller;

public class DeckOfCards {

	public static void main(String[] args)
	{
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
		
	}

}
