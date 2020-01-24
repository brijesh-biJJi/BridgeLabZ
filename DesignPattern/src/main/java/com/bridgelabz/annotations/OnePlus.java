package com.bridgelabz.annotations;

@SmartPhone()
public class OnePlus extends MotoGSeries{
	private String model;
	private double size;
	
	public OnePlus(String model, double d) {
		this.model = model;
		this.size = d;
	}
}
