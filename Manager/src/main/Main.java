package main;

import model.Taxi;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start program");		
		Taxi taxi1 = new Taxi("Toyota", 0);
		Taxi taxi2 = new Taxi();
		taxi2.setMarke("Audi");
		taxi2.setVorschaeden(1);
	}
}
