package by.htp.task3.viewer;

import by.htp.task3.entity.Airline;
import by.htp.task3.entity.AirlineBoard;

public class Viewer {
	
	public void printDestination(AirlineBoard board) {
		System.out.println(board.getBoard().get(0).getDestination() + ":");
		for(Airline s : board.getBoard()) {
			System.out.println("Flight " + s.getFlight());
		}
	}
	public void printDay(AirlineBoard board) {
		System.out.println(board.getBoard().get(0).getDayOfWeek() + ":");
		for(Airline s : board.getBoard()) {
			System.out.println("Day of week " + s.getDayOfWeek());
		}
	}
	public void printDayTime(AirlineBoard board) {
		System.out.println("Flight - Day - Time");
		for(Airline s : board.getBoard()) {
			System.out.println(s.getFlight() + " - " + s.getDayOfWeek() +  " - " + s.getTimeFlight());
		}
	}

}
