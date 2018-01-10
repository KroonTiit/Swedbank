package com.playground;

public class PlaysiteHistory {
	public Object playsite;
	public int timePlayedInSeconds;
	
	public PlaysiteHistory(Object playsite, int timePlayedInSeconds) {
		super();
		this.playsite = playsite;
		this.timePlayedInSeconds = timePlayedInSeconds;
	}
	public Object getPlaysite() {
		return playsite;
	}
	public void setPlaysite(Object playsite) {
		this.playsite = playsite;
	}
	public int getTimePlayedInSeconds() {
		return timePlayedInSeconds;
	}
	public void setTimePlayedInSeconds(int timePlayedInSeconds) {
		this.timePlayedInSeconds = timePlayedInSeconds;
	}
}
