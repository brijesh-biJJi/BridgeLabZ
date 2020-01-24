package com.bridgelabz.annotations;

import java.lang.annotation.Annotation;

public class AnnotationDemo {

	public static void main(String[] args) {
		//MotoGSeries moto=new MotoGSeries("Moto G4", 5.5);
		OnePlus one=new OnePlus("OnePlus 7T", 6.0);
		/**
		 * Using reflection API to get class name
		 */
		Class c=one.getClass();
		
		/**
		 * get annotation
		 */
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone) an;
		System.out.println("OS :: "+s.os()+"\nVersion :: "+s.version());
	}

}
