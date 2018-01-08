package com.playground.kid;

public class Kid {
	public int age;
	public String name;
	public Ticket ticket;
	
	public Kid(){
		
	}
	
	public Kid(int age, String name, Ticket ticket) {
		super();
		this.age = age;
		this.name = name;
		this.ticket = ticket;
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
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
}
