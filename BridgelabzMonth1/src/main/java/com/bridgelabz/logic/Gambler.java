package com.bridgelabz.logic;

import com.bridgelabz.inputscanner.InputScanner;

public class Gambler 
{
	double stake,goal,betprice;
	int noOfPlay,win;
	public Gambler()
	{
		System.out.println("Enter the stake");
		stake=InputScanner.inputDouble();
		
		System.out.println("Enter the goal");
		goal=InputScanner.inputDouble();
		
	}
	
	public static void main(String[] args) 
	{
		Gambler g=new  Gambler();
		g.playGame();
		g.diplayResult();
	}
	
	

	private boolean winOrLoss() 
	{
		if(Math.random()<0.5)
			return true;
		else
			return false;
	}

	private void playGame() 
	{
		noOfPlay++;
		System.out.println("Stake : "+stake);
		System.out.println("Goal : "+goal);
		System.out.println("Enter the betprice");
		betprice=InputScanner.inputDouble();
		System.out.println("BetPrice : "+betprice);
		
		if(winOrLoss())
		{
			win++;
			stake+=betprice;
		}
		else
			stake-=betprice;
		
		if(stake<=0 || stake>=goal)
			return;
		else
			playGame();
	}

	private void diplayResult() 
	{
		System.out.println("\nNumber of play : "+noOfPlay);
		System.out.println("Number of Win : "+win);
		System.out.println("Stake : "+stake);
		System.out.println("Goal : "+goal);
		
	}
}
