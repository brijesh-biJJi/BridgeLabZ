package com.bridgelabz.logic;

import java.util.*;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class CouponNumbers 
{
	static List<Integer> al=Utility.getArrayListObject();
	static Random rd=new Random();
	static int mCount=0;
	public static void main(String[] args) 
	{
		
		System.out.println("enter the n coupon number");
		int totalCoupon=InputScanner.inputInteger();
		
		System.out.println("Total count : "+generateCoupon(totalCoupon));
		System.out.println("The distinct "+totalCoupon+" coupon numbers are : "+al);
	}
	private static int generateCoupon(int tc) 
	{
		while(al.size()!=tc)
		{
			int rn=generateRandomNumber();
			if(al.contains(rn))
				mCount++;
			else{
				mCount++;
				al.add(rn);
			}
		}
		return mCount;
	}
	private static int generateRandomNumber() 
	{
		return rd.nextInt(10)+1;
	}

}
