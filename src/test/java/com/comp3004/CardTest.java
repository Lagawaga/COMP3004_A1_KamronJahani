package com.comp3004;

import junit.framework.TestCase;

public class CardTest extends TestCase{
	
	public void testFaceCard() {
		Card jack = new Card(11, 'S');
		Card queen = new Card(12, 'H');
		Card king = new Card(13, 'C');
		
		boolean lowAce = true;
		assertEquals(10, jack.getValue(lowAce));
		assertEquals(10, queen.getValue(lowAce));
		assertEquals(10, king.getValue(lowAce));
		
		lowAce = false;
		assertEquals(10, jack.getValue(lowAce));
		assertEquals(10, queen.getValue(lowAce));
		assertEquals(10, king.getValue(lowAce));
		
	}
	
	public void testIsAceLow() {
		Card ace = new Card(1, 'H');
		boolean lowAce = true;
		assertEquals(1, ace.getValue(lowAce));
	}
	
	public void testIsAceHigh() {
		Card ace = new Card(1, 'C');
		boolean lowAce = false;
		assertEquals(11, ace.getValue(lowAce));
	}
	
	public void testNumberCard() {
		Card seven = new Card(7, 'S');
		
		boolean lowAce = true;
		assertEquals(7, seven.getValue(lowAce));
		
		lowAce = false;
		assertEquals(7, seven.getValue(lowAce));
		
	}
	
	public void testToStringFaceCard() {
		Card jack = new Card(11, 'S');
		Card queen = new Card(12, 'H');
		Card king = new Card(13, 'C');
		
		assertEquals("SJ", jack.toString());
		assertEquals("HQ", queen.toString());
		assertEquals("CK", king.toString());
		
	}
	
	public void testToStringNumberCard() {
		Card seven = new Card(7, 'H');
		
		assertEquals("H7", seven.toString());
	}
	
	
}
