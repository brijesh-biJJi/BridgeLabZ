package com.bridgelabz.logic;

import java.util.ArrayList;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class TicTacToe 
{
	static char[][] board =new char[3][3];
	
	
	//Replace choice with marker
	private static void replace(char[][] board, int find, char mark) 
	{
		for(int i=0;i<3;i++)
		{
			for (int j = 0; j < 3; j++) 
			{
				if(board[i][j]==find){
					board[i][j]=mark;
					return;
				}
			}
		}	
	}
	
	//Check for win
	private static boolean checkForWin()
	{
		return (checkForRow() || checkForCol() || checkForDiagonal());	
	}
	
	
	
	//Check for Row Function
	private static boolean checkForRow() 
	{
		for(int i=0; i<3 ;i++)
		{
			if(check(board[i][0],board[i][1],board[i][2])==true)
				return true;
		}
		return false;
	}
	
	//Check for Col Function
	private static boolean checkForCol() 
	{
		for(int i=0; i<3 ;i++)
		{
			if(check(board[0][i],board[1][i],board[2][i])==true)
				return true;
		}
		return false;
	}

	//Check for Diagonal Function
	private static boolean checkForDiagonal() 
	{
		return ((check(board[0][0],board[1][1],board[2][2])==true) || (check(board[0][2],board[1][1],board[2][0]))==true);
	}
	
	//Check Function
	private static boolean check(char c1, char c2, char c3) 
	{
		return ((c1==c2) && (c2==c3));
	}
    
	
	//Main Functuion
	public static void main(String[] args) 
	{
		ArrayList<Character> al=new ArrayList<>();
		int counter=0;
		String player1="",player2="";
		char player1mark,player2mark;
		char choice=' ';
		
		//Initialize Board
		for(int i=0;i<3;i++)
		{
			for (int j = 0; j < 3; j++) 
			{
				//Character.forDigit method returns the char representation of the specified 
				board[i][j]=Character.forDigit(++counter, 10);
			}
		}
		
		//Display Board
		Utility.display(board);
		
		//Enter Player 1 Name
		System.out.println("Enter player1 name");
		player1=InputScanner.inputWord();
		
		//Enter Player 1 Name
		System.out.println("Enter player2 name");
		player2=InputScanner.inputWord();
		
		//Enter Player 1 Marker
		System.out.println(player1+" Select Marker (X or O) : ");
		player1mark=InputScanner.inputCharacter();
		
		
		//Check Marker
		if(player1mark!='X' && player1mark!='x' && player1mark!='O' && player1mark!='o')
		{
			System.out.println("Invalid Input...Enter Correct marker symbol..");
			player1mark=InputScanner.inputCharacter();
		}
		
		//Assign the marker to another player
		if(player1mark=='X' || player1mark=='x')
				player2mark='O';
		else
			player2mark='X';
		
		//Take User choice
		for(int i=0;i<4;i++)
		{
			//Player 1 choice
			System.out.println(player1+" Enter the choice : ");
			choice=InputScanner.inputCharacter();
			
			//To check whether position Empty or Not
			if(al.contains(choice))
			{
				System.out.println("Already selected...Choose other position..");
				choice=InputScanner.inputCharacter();
			}
			else
				al.add(choice);
			
			
			//replace function to set the mark
			replace(board,choice,player1mark);
			Utility.display(board);
			if(i>=2)
			{
				if(checkForWin())
				{
					System.out.println(player1+" Won the Game....!");
					return;
				}
			}
			
			//Player 2 choice
			System.out.println(player2+ " Enter the choice: ");
			choice=InputScanner.inputCharacter();
			
			//To check whether position Empty or Not
			if(al.contains(choice))
			{
				System.out.println("Already selected...Choose other position..");
				choice=InputScanner.inputCharacter();
			}
			else
				al.add(choice);
			
			//replace function to set the mark
			replace(board,choice,player2mark);
			Utility.display(board);
			if(i>=2)
			{
				if(checkForWin())
				{
					System.out.println(player2+" Won the Game....!");
					return;
				}
			}
		}
		//upper loop runs for 8 times but board contains 9 position
		System.out.println(player1+" Enter the choice : ");
		choice=InputScanner.inputCharacter();
		
		
		//To check whether position Empty or Not
		if(al.contains(choice))
		{
			System.out.println("Already selected...Choose other position..");
			choice=InputScanner.inputCharacter();
		}
		else
			al.add(choice);
		
		
		replace(board,choice,player1mark);
		Utility.display(board);
		
		if(checkForWin())
			System.out.println(player1+" Won the Game....!");
		else
			System.out.println("Match Draw...!");
	}
}
