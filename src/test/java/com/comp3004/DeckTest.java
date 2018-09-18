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
		deck.addCard(deck.getCard(0));
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
	
	public void testDeckTotal() {
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		boolean lowAce;
		lowAce = true;
		deck2.addCard(deck1.getCard(0));
		deck2.addCard(deck1.getCard(1));
		
		assertEquals((deck2.getCard(0).getValue(lowAce)+deck2.getCard(1).getValue(lowAce)), deck2.deckTotal());
	}
}
