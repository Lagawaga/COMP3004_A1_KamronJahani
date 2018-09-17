package com.comp3004;

public class Card {
	
	private int value;
	private char suit;

	public Card(int i, char c) {
		this.value = i;
		this.suit = c;
	}

	public int getValue(boolean lowAce) {
		
		if(value == 1 && lowAce) {
			return 1;
		}else if(value == 1 && !lowAce){
			return 11;
		}
		
		if(value < 10) {
			return value;
		}else {
			return 10;
		}
		
	}
	
	public String toString() {
		if(value == 1 && suit == 'D') {
			return "DA";
		}else if(value == 1 && suit == 'H'){
			return "HA";
		}else if(value == 1 && suit == 'C'){
			return "CA";
		}else if(value == 1 && suit == 'S'){
			return "SA";
		}else if(value == 11 && suit == 'D'){
			return "DJ";
		}else if(value == 11 && suit == 'H'){
			return "HJ";
		}else if(value == 11 && suit == 'C'){
			return "CJ";
		}else if(value == 11 && suit == 'S'){
			return "SJ";
		}else if(value == 12 && suit == 'D'){
			return "DQ";
		}else if(value == 12 && suit == 'H'){
			return "HQ";
		}else if(value == 12 && suit == 'C'){
			return "CQ";
		}else if(value == 12 && suit == 'S'){
			return "SQ";
		}else if(value == 13 && suit == 'D'){
			return "DK";
		}else if(value == 13 && suit == 'H'){
			return "HK";
		}else if(value == 13 && suit == 'C'){
			return "CK";
		}else if(value == 13 && suit == 'S'){
			return "SK";
		}else if(value < 11 && value > 1){
			if(suit == 'D') {
				return ("D" + value);
			}else if(suit == 'H') {
				return ("H" + value); 
			}else if(suit == 'C') {
				return ("C" + value);
			}else if(suit == 'S'){
				return ("S" + value);
			}else {
				return null;
			}
		}else {
			return null;
		}
	}
	

}
