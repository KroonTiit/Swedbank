package com.playground.kid;

public class Ticket {
	public int number;
	public boolean vip;
	
	public Ticket(int number, boolean vip) {
		super();
		this.number = number;
		this.vip = vip;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
}
