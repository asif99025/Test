//adding ancomment line
package com.harman;

public class Bike {

	private String name;
	private int Modelyear ;
	private String color;
	private int cc;
	private String make;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModelyear() {
		return Modelyear;
	}
	public void setModelyear(int modelyear) {
		Modelyear = modelyear;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Bike(String name, int modelyear, String color, int cc,String make) {
		this.name = name;
		Modelyear = modelyear;
		this.color = color;
		this.cc = cc;
		this.make=make;
	}
	@Override
	public String toString() {
		return "Bike [name=" + name + ", Modelyear=" + Modelyear + ", color=" + color + ", cc=" + cc + "]";
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}



}
