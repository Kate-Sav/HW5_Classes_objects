package by.htp.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class AirlineBoard {
	List<Airline> board = new ArrayList<Airline>();

	public List<Airline> getBoard() {
		return board;
	}
	
	public void addAirline(Airline l) {
		board.add(l);
	}
}
