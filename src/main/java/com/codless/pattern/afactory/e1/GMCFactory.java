package com.codless.pattern.afactory.e1;

public class GMCFactory implements FactoryCar {

	public Minivan createMinivan() {
		
		return new Savana();
	}

	public Pickup createPickup() {
		
		return new Sierra();
	}

}
