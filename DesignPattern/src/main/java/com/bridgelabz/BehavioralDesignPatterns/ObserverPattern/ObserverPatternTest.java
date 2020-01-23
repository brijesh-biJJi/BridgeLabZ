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
		
		/**
		 * Register observers to the subject
		 */
		topic.register(ob1);
		topic.register(ob2);
		topic.register(ob3);
		
		/**
		 * Attach observer to subject
		 */
		ob1.setSubject(topic);
		ob2.setSubject(topic);
		ob3.setSubject(topic);
		
		/**
		 * Check if any update is available
		 */
		ob1.update();
		
		/**
		 * Now send message to subject
		 */
		
		topic.postMessage("Observer Design Pattern..."); 
	}

}
