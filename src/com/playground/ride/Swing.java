package com.playground.ride;

import java.util.List;

import com.playground.Playsite;
import com.playground.kid.Kid;

public class Swing extends Playsite{
	public List<Kid> kids;

	public Swing() {
		super();
	}

	public List<Kid> getKids() {
		return kids;
	}

	public void setKids(List<Kid> kids) {
		this.kids = kids;
	}
	
	
}
