package com.comp3004;

import junit.framework.TestCase;

public class DeckTest extends TestCase{

	public void testNewDeck(){
		Deck deck = new Deck();
		deck.newDeck();
		assertEquals(52, deck.numCards());
	}
	
	public void testRemoveCard() {
		Deck deck = new Deck();
		deck.newDeck();
		deck.remove(1);
		
		assertEquals(51, deck.numCards());
	}
	
}
