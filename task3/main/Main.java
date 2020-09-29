package by.htp.task3.main;

import java.time.LocalTime;

import by.htp.task3.entity.Airline;
import by.htp.task3.entity.AirlineBoard;
import by.htp.task3.logic.Logic;
import by.htp.task3.viewer.Viewer;

public class Main {
	public static void main(String[] args) {

		Airline a1 = new Airline(27, "Moscow", "Monday", LocalTime.of(2, 30));
		Airline a2 = new Airline(33, "Paris", "Friday", LocalTime.of(3, 30));
		Airline a3 = new Airline(543, "Kiev", "Monday", LocalTime.of(5, 30));
		AirlineBoard board = new AirlineBoard();
		board.addAirline(a1);
		board.addAirline(a2);
		board.addAirline(a3);
		Logic logic = new Logic();
		AirlineBoard newboard = logic.byDayTime(board, "Monday", LocalTime.of(2, 1));

		Viewer v = new Viewer();
		v.printDayTime(newboard);
		
		}
	}


