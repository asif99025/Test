package com.harman;

public class Bike {

	private String name;
	private int Modelyear ;
	private String color;
	private int cc;
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
	public Bike(String name, int modelyear, String color, int cc) {
		this.name = name;
		Modelyear = modelyear;
		this.color = color;
		this.cc = cc;
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
