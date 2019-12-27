package com.bridgelabz.algorithms;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;

import com.bridgelabz.inputscanner.InputScanner;

public class ReGex {
static String dob;
	public static void main(String[] args) 
	{
		String str,userName,fname="<<name>>",fullname="<<full name>>",mb="xxxxxxxxxx",d="01/01/2016",mob;
		
		str="Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. \nPlease,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		System.out.println("Enter the USer NAme..!");
		userName=InputScanner.inputSentence();
		String[] stringArray=userName.split(" ");
	
		
		System.out.println("Enter the Mobile Number..");
		mob=InputScanner.inputWord();
		
		/*System.out.println("Enter the Date...");
		dob=InputScanner.inputWord();*/
		
		setdate(getFormatedDate(new Date()));
		
		Pattern p=Pattern.compile(fname);
		Matcher m=p.matcher(str);
		str=m.replaceAll(stringArray[0]);
		
		p=Pattern.compile(fullname);
		m=p.matcher(str);
		str=m.replaceAll(userName);
		
		p=Pattern.compile(mb);
		m=p.matcher(str);
		str=m.replaceAll(mob);
		
		p=Pattern.compile(d);
		m=p.matcher(str);
		str=m.replaceAll(date());
		
		System.out.println(str);
	}
	
	public static  void setdate(String date){
		dob=date;
	}
	
	public static String date(){
		return dob;
	}
	
	public static String getFormatedDate(Date date)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}
}
