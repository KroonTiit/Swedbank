package com.playground.kid;

import java.util.List;

import com.playground.Playsite;
import com.playground.PlaysiteHistory;

public class Kid {
	public int age;
	public String name;
	public Ticket ticket;
	public List<PlaysiteHistory> playsitesPlayed;

	public Kid(){
		
	}
	
	public Kid(int age, String name, Ticket ticket) {
		super();
		this.age = age;
		this.name = name;
		this.ticket = ticket;
	}
	
	public int getAge() {
		Playsite play = new Playsite();
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
	
	public List<PlaysiteHistory> getPlaysitesPlayed() {
		return playsitesPlayed;
	}
	
	public void setPlaysitesPlayed(Object playsite, int timePlayedInSeconds) {
		PlaysiteHistory playedAt = new PlaysiteHistory(playsite, timePlayedInSeconds);
		this.playsitesPlayed.add(playedAt);
	}
}
