package com.bridgelabz.annotations;


@SmartPhone(os="Android",version=7.0)
public class MotoGSeries {
	private String model;
	private double size;
	
	public MotoGSeries() {}
	public MotoGSeries(String model, double d) {
		this.model = model;
		this.size = d;
	}
}








