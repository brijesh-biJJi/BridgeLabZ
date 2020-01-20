package com.bridgelabz.CreationalDesignPatterns.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {

	public static void main(String[] args)
	{
		SerializedSingleton serialObj=SerializedSingleton.getInstance();
		try {
			/**
			 * Serialize from file to object
			 */
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("file1.txt"));
			out.writeObject(serialObj);
			out.close();
			
			/**
			 * Deserialize from file to object
			 */
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("file1.txt"));
			
			SerializedSingleton serialObj1=(SerializedSingleton) in.readObject();
			in.close();
			
			System.out.println("InstanceOne hashCode : "+serialObj.hashCode());
			System.out.println("InstanceTwo hashCode : "+serialObj1.hashCode());
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
