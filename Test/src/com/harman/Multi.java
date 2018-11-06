package com.harman;

import java.util.ArrayList;

public class Multi  {

	public static void main(String[] args) {

		Bike b=new Bike("Pulsar",2018,"black",110,"make");	
		Bike b1=new Bike("FZ",2011,"red",110,"make");	
		Bike b2=new Bike("Splendor",2012,"white",120,"make");	
		Bike b3=new Bike("Apache",2019,"yellow",110,"make");	
		Bike b4=new Bike("DIO",2016,"black",140,"make");	
		
		
		System.out.println("cc is "+b.getCc());
		System.out.println("to string is called : " + b.toString());
		
		ServiceCenterImpl servicecenter=new ServiceCenterImpl();
		
		servicecenter.polishing();
		servicecenter.washing();
		
		ArrayList<Bike> bikes=new ArrayList<>();
		bikes.add(b);
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		bikes.add(b4);
		
		
		System.out.println("Totl bikes are"+ bikes.size()+" And they are ");
		for(int i=0;i<bikes.size();i++)
		System.out.println(bikes.get(i));
		
		
		

	}



}
