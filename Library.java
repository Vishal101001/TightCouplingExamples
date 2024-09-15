package com.tightcoupling;

public class Library {
	
	Books b;
	
	Library(){
		b = new Books();
	}
	
	public void learn() {
		System.out.println("learning in..");
		b.read();
	}

	

}
