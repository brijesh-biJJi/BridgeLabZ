package com.bridgelabz.ServiceImplementation;

import java.util.Random;

import com.bridgelabz.Services.IDeckOfCards;

public class DeckOfCardsImpl implements IDeckOfCards
{
	/**
	 * Method is to Shuffle the Card inside the Deck
	 */
	@Override
	public String[][] shuffleCardsDeck(String[][] deck,int r1,int c1,int r2,int c2) 
	{
		String temp=deck[r1][c1];
		deck[r1][c1]=deck[r2][c2];
		deck[r2][c2]=temp;
		return deck;
		
	}
	
}
