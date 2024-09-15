package com.tightcoupling;

public class Car1 {

	PetrolEngine p;
	DieselEngine d;
	
	Car1(){
		p=new PetrolEngine();
		d=new DieselEngine();
	}
	
	public void move() {
		System.out.println("car is move with....");
		p.show();
		d.show();
	}
}
