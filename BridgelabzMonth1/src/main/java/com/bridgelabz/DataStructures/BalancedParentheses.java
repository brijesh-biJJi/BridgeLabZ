package com.bridgelabz.DataStructures;

import com.bridgelabz.inputscanner.InputScanner;

public class BalancedParentheses 
{
	//isBalanced method is use to check the string is balanced or not 
	public static boolean isbalanced(String str)
	{
		StackBalancedParenthese<Character> stkbp=new StackBalancedParenthese<>(str.length());
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch=='[' || ch=='{' || ch=='(')
				stkbp.push(ch);
			else
			{
				if(stkbp.isEmpty())
					return false;
				char pch=stkbp.pop();
				if(ch==']')
				{
					if(pch!='[')
						return false;
				}
				else if(ch=='}')
				{
					if(pch!='{')
						return false;
				}
				else if(ch==')')
				{
					if(pch!='(')
						return false;
				}
			}
		}
		return stkbp.isEmpty();	
	}
	
		
	
	public static void main(String[] args)
	{
		System.out.println("Enter the String...");
		String str=InputScanner.inputWord();
		boolean rs=isbalanced(str);
		if(rs)
			System.out.println("String is Balanced..");
		else
			System.out.println("String is Not Balanced..");
	}

}
