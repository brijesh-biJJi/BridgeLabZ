package com.bridgelabz.BehavioralDesignPatterns.ObserverPattern;

public class ObserverPatternTest {

	public static void main(String[] args)
	{
		/**
		 * Create Subject
		 */
		MyTopic topic =new MyTopic();
		
		/**
		 * Create Observers
		 */
		Observer ob1=new MyTopicSubscriber("Brijesh");
		Observer ob2=new MyTopicSubscriber("Baijith");
		Observer ob3=new MyTopicSubscriber("Srijan");
	}

}
