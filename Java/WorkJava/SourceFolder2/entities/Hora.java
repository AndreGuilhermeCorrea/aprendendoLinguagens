package entities;

public class Hora {

	private int hours, minutes, seconds;

	public Hora(int hours, int minutes, int seconds) {
		// preenchendo as horas
		if (hours >= 0 && hours < 24)
			this.hours = hours;
		else
			throw new IllegalArgumentException("Hora inválida");

		// preenchendo os minutos
		if (minutes >= 0 && minutes < 60)
			this.minutes = minutes;
		else
			throw new IllegalArgumentException("Minutos inválidos");

		// preenchendo os segundos
		if (seconds >= 0 && seconds < 60)
			this.seconds = seconds;
		else
			throw new IllegalArgumentException("Segundos inválidos");

	}

	@Override
	public String toString() {
		return String.format("%d:%d:%d", getHour(), getMinute(), getSecond());
	}

	public int getHour() {
		return this.hours;
	}

	public int getMinute() {
		return this.minutes;
	}

	public int getSecond() {
		return this.seconds;
	}

}
