package com.bridgelabz.logic;

import com.bridgelabz.inputscanner.InputScanner;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		long time;
		long start;
		char finish;
		boolean started=true;
		start=System.currentTimeMillis();
		do
		{
			if(started)
			{
				System.out.println("Press N to stop");
				finish=InputScanner.inputCharacter();
				if(finish=='n')
				{
					long now=System.currentTimeMillis();
					time=now-start;
					System.out.println("Time : "+(time/1000)+" sec");
					started=false;
				}
			}
			else
			{
				System.out.println("Press Y to start");
				finish=InputScanner.inputCharacter();
				if(finish=='y')
				{
					start=System.currentTimeMillis();
					started=true;
					finish='c';
					continue;
				}
				
			}
			System.out.println("Press c to continue Or s to discontinue.....");
			finish=InputScanner.inputCharacter();
		}while(finish=='c');
		System.out.println("THANK YOU");
	}
}
