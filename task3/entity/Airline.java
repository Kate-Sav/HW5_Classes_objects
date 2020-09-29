package by.htp.task3.entity;

import java.time.LocalTime;

public class Airline {
	private String destination;
	int flight;
	String plane;
	LocalTime timeFlight;
	String dayOfWeek;
	
	public Airline() {}
	
	public Airline(int flight, String destination, String dayOfWeek, LocalTime timeFlight) {
		this.flight = flight;
		this.destination = destination;
		this.dayOfWeek = dayOfWeek;
		this.timeFlight = timeFlight;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlight() {
		return flight;
	}

	public void setFlight(int flight) {
		this.flight = flight;
	}

	public String getPlane() {
		return plane;
	}

	public void setPlane(String plane) {
		this.plane = plane;
	}

	public LocalTime getTimeFlight() {
		return timeFlight;
	}

	public void setTimeFlight(LocalTime timeFlight) {
		this.timeFlight = timeFlight;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flight;
		result = prime * result + ((plane == null) ? 0 : plane.hashCode());
		result = prime * result + ((timeFlight == null) ? 0 : timeFlight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (dayOfWeek == null) {
			if (other.dayOfWeek != null)
				return false;
		} else if (!dayOfWeek.equals(other.dayOfWeek))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flight != other.flight)
			return false;
		if (plane == null) {
			if (other.plane != null)
				return false;
		} else if (!plane.equals(other.plane))
			return false;
		if (timeFlight == null) {
			if (other.timeFlight != null)
				return false;
		} else if (!timeFlight.equals(other.timeFlight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flight=" + flight + ", plane=" + plane + ", timeFlight="
				+ timeFlight + ", dayOfWeek=" + dayOfWeek + "]";
	}
	

	
	
	

}
