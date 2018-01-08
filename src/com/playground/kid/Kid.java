package com.playground.kid;

import java.util.List;

import com.playground.PlaygroundHistory;

public class Kid {
	public int age;
	public String name;
	public Ticket ticket;
	public List<PlaygroundHistory> playsitesPlayed;
	
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
	public List<PlaygroundHistory> getPlaysitesPlayed() {
		return playsitesPlayed;
	}
	public void setPlaysitesPlayed(Object playsite, int timePlayedInSeconds) {
		PlaygroundHistory playedAt = new PlaygroundHistory(playsite, timePlayedInSeconds);
		this.playsitesPlayed.add(playedAt);
	}
}
