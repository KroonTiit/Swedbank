package com.carusel.kid;

public class Kid {
	public int age;
	public String name;
	public int ticketNr;
	
	public Kid(int age, String name, int ticketNr) {
		super();
		this.age = age;
		this.name = name;
		this.ticketNr = ticketNr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTicketNr() {
		return ticketNr;
	}
	public void setTicketNr(int ticketNr) {
		this.ticketNr = ticketNr;
	}
}
