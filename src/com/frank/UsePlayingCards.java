package com.frank;

import java.util.ArrayList;
import java.util.List;

public class UsePlayingCards {
// This is our application program which will instantiate object and use thier methods to manipulate them
// We know this is the application program because it has the main() method
	public static void main(String[] args) {

		// Use enums to instantiate, remember enums are public for this purpose
		AmericanPlayingCard aUSACard = new AmericanPlayingCard(AmericanPlayingCard.CardValue.ONE, AmericanPlayingCard.CardSuit.HEART);
		System.out.println("aUSACard is :");
		aUSACard.showCard();  // runs the AmericanPlayingCard showCard()

		AmericanPlayingCard aUSACard2 = new AmericanPlayingCard(AmericanPlayingCard.CardValue.KING, AmericanPlayingCard.CardSuit.SPADE);
		System.out.println("aUSACard2 is :");
		aUSACard2.showCard();  // runs the AmericanPlayingCard showCard()
		// When you type aUSACard2. and see the list of methods provided, those are available due to inheritance

		System.out.println("The value in aUSACard is: " + aUSACard.getValue());
		System.out.println("The value in aUSACard2 is: " + aUSACard2.getValue());
		// Normally Java will look for a method in the class of the object used to invoke the method
		// aUsaCard.getValue() - Look for getValue() in AmericanPlayingCard class, but it's not there
		// Java next looks to the super class and finds getValue() in PlayingCard class
		// If necessary, Java continues up the inheritance tree

		ItalianPlayingCard anItalianCard1 = new ItalianPlayingCard(ItalianPlayingCard.CardValue.CAVALLO, ItalianPlayingCard.CardSuit.CUPS);
		System.out.println("anItalianCard1 is: ");
		anItalianCard1.showCard();

		System.out.println("The value in anItalianCard is: " + anItalianCard1.getValue());

		SwissPlayingCard aSwissCard1 = new SwissPlayingCard(SwissPlayingCard.CardValue.AS, SwissPlayingCard.CardSuit.BALLS);
		System.out.println("aSwissCard1 is: ");
		aSwissCard1.showCard();

		System.out.println("-".repeat(80) + "\n Polymorphism examples start here \n" + "-".repeat(80));

		// Even though PlayingCard is an abstract class, we can still define a reference to it because of polymorphism
		PlayingCard theCard; // Defined a reference to a superclass object

		// PlayingCard aPlayingCard = new PlayingCard(); // Cannot instantiate an abstract class

		System.out.println("Assigning an ItalianPlayingCard object to the super class reference");
		theCard = anItalianCard1; // Assign a subclass object to the superclass reference to implement polymorphism
		theCard.showCard();

		System.out.println("Assigning a SwissPlayingCard object to the super class reference");
		theCard = aSwissCard1; // Assign a subclass object to the superclass reference to implement polymorphism
		theCard.showCard();

		System.out.println("Creating and processing an ArrayList using polymorphism");

		List<PlayingCard> listOfCards = new ArrayList<>(); // Define a list of superclass objects

		listOfCards.add(anItalianCard1); // Assigning a subclass object into the superclass list
		listOfCards.add(aUSACard);
		listOfCards.add(aSwissCard1);
		listOfCards.add(new ItalianPlayingCard());

		// Loop through the List of cards to display them using showCard()
		// superclass reference : superclass list
		for (PlayingCard anElement : listOfCards) {
			anElement.showCard();
		}

	}  // End of main()

}  // End of class that holds main()
