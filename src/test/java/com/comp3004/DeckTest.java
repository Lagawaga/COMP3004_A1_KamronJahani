package com.comp3004;

import junit.framework.TestCase;

public class DeckTest extends Testcase{

	public void testNewDeck(){
		Deck deck = new Deck();
		
		assertEquals(52, deck.numCards());
	}
	
	public void removeCard() {
		Deck deck = new Deck();
		deck.removeCard();
		
		assertEquals(51, deck.numCards());
	}
	
}
