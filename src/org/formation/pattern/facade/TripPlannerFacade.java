package org.formation.pattern.facade;

public class TripPlannerFacade {
	private Airline al = new Airline();
	private Hotel h = new Hotel();
	private Safari s = new Safari();
	
	public void planTrip(){
		al.buyTicket();
		h.reserveRoom();
		s.buySafari();
	}
	
	public void cancelTrip(){
		al.cancelTicket();
		h.cancelRoom();
		s.cancelSafari();
	}
}