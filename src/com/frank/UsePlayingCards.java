package com.frank;

import java.util.ArrayList;

public class UsePlayingCards {
// This is our application program which will instantiate object and use thier methods to manipulate them
// We know this is the application program because it has the main() method
	public static void main(String[] args) {

		AmericanPlayingCard aUSACard = new AmericanPlayingCard(1, "HEARTS");
		System.out.println("aUSACard is :");
		aUSACard.showCard();  // runs the AmericanPlayingCard showCard()

		AmericanPlayingCard aUSACard2 = new AmericanPlayingCard(14, "SPADES");
		System.out.println("aUSACard2 is :");
		aUSACard2.showCard();

		AmericanPlayingCard aUSACard3 = new AmericanPlayingCard(-1, "SPADES");
		System.out.println("aUSACard3 is :");
		aUSACard3.showCard();

		AmericanPlayingCard aUSACard4 = new AmericanPlayingCard(13, "Dumbledore");
		System.out.println("aUSACard4 is :");
		aUSACard4.showCard();


	}  // End of main()
	// This must be static because what calls it is static
	static void displayCard(PlayingCard aCard) {  // a function receives a super class object
		aCard.showCard();  // use the super class object to run a method - Polymorphism will run the correct method
	}


}  // End of class that holds main()
