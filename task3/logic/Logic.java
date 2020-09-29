package by.htp.task3.logic;

import java.time.LocalTime;

import by.htp.task3.entity.Airline;
import by.htp.task3.entity.AirlineBoard;

public class Logic {

	public AirlineBoard byDestination(AirlineBoard board, String destination) {
		AirlineBoard newboard = new AirlineBoard();
		for (Airline s : board.getBoard()) {
			if (s.getDestination().equals(destination)) {
				newboard.getBoard().add(s);
			}
		}
		return newboard;
	}
	public AirlineBoard byDayOfWeek(AirlineBoard board, String dayOfWeek) {
		AirlineBoard newboard = new AirlineBoard();
		for (Airline s : board.getBoard()) {
			if (s.getDayOfWeek().equals(dayOfWeek)) {
				newboard.getBoard().add(s);
			}
		}
		return newboard;
	}
	public AirlineBoard byDayTime(AirlineBoard board, String dayOfWeek, LocalTime time) {
		AirlineBoard newboard = new AirlineBoard();
		for (Airline s : board.getBoard()) {
			if (s.getDayOfWeek().equals(dayOfWeek) && s.getTimeFlight().isAfter(time)) {
				newboard.getBoard().add(s);
			}
		}
		return newboard;
	}
	

}
