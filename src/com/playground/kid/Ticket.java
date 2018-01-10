package com.playground.kid;

public class Ticket {
	public int number;
	public int vipJumps;
	
	public Ticket(int number, int vip) {
		super();
		this.number = number;
		this.vipJumps = vip;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int isVip() {
		return vipJumps;
	}
	
	public void setVip(int vip) {
		this.vipJumps = vip;
	}
}
