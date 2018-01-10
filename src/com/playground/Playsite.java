package com.playground;

import java.util.ArrayList;
import java.util.List;

import com.playground.kid.Kid;

public class Playsite {
	public List<Kid> kidsOnSite = new ArrayList<Kid>();
	public int nrOfKidsAllowed;
	public List<Kid> queue = new ArrayList<Kid>();
	public float utilisation;
	public int totalVisitors;
	
	public Playsite(){
		
	}
	public Playsite(int nrOfKidsAllowed) {
		super();
		this.nrOfKidsAllowed = nrOfKidsAllowed;
	}

	public int getNrOfKidsAllowed() {
		return nrOfKidsAllowed;
	}

	public void setNrOfKidsAllowed(int nrOfKidsAllowed) {
		this.nrOfKidsAllowed = nrOfKidsAllowed;
	}

	public List<Kid> getQueue() {
		return queue;
	}

	public void setQueue(List<Kid> queue) {
		this.queue = queue;
	}
	
	public List<Kid> getKidsOnSite() {
		return kidsOnSite;
	}
	
	public void setKidsOnSite(List<Kid> kidsOnSite) {
		this.kidsOnSite = kidsOnSite;
	}
	
	public void addKidToQueue(Kid kid){
		this.queue.add(kid);
	}
	
	public void removeKidFromQueue(Kid kid){
			this.queue.remove(kid);
	}
	
	public void addKidToSite(Kid kid){
		if(this.queue.isEmpty() && (kidsOnSite.size() < nrOfKidsAllowed)){
			this.kidsOnSite.add(kid);
			setVisitorTotal(this.totalVisitors+1);
		} else if(!this.queue.isEmpty()  && (kidsOnSite.size() < nrOfKidsAllowed)) {
			addKidToQueue(kid);
			kid = this.queue.get(0);
			removeKidFromQueue(kid);
			this.kidsOnSite.add(kid);
			if(this.queue.isEmpty() || this.queue.size()>1){
				restuctureQueue();
				setVisitorTotal(this.totalVisitors+1);
			}
		} else {
			addKidToQueue(kid);
		}
	}
	
	public void removeKidFromSite(Kid kid){
		if(!kidsOnSite.isEmpty()){
			this.kidsOnSite.remove(kid);			
		}
	}
	
	private void restuctureQueue(){
		List<Kid> tempQueue = new ArrayList<Kid>();
		for(int i = 0; i<this.queue.size()-1; i++){
			tempQueue.add(i, this.queue.get(i+1));
		}
		this.queue=tempQueue;
	}
	
	public float getUtilisation() {
		return ((float)this.kidsOnSite.size() / (float)this.nrOfKidsAllowed) * 100;
	}
	
	public int getVisitorTotal() {
		return totalVisitors;
	}
	
	private void setVisitorTotal(int visitorTotal) {
		this.totalVisitors = visitorTotal;
	}
}
