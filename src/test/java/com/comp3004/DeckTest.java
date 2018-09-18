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
	
	public void testAddCard() {
		Deck deck = new Deck();
		deck.newDeck();
		deck.remove(1);
		deck.remove(2);
		deck.addCard();
		assertEquals(51, deck.numCards());
	}
	
	public void testDrawCard() {
		Deck deck = new Deck();
		Deck playerDeck = new Deck();
		
		deck.newDeck();
		
		playerDeck.drawCard(deck);
		assertEquals(1, playerDeck.numCards());
		assertEquals(51, deck.numCards());
		
	}
	
}
