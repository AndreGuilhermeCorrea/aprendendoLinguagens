package entities;

import java.util.Date;

//classe HourContract
public class HourContract {
	
	//atributos:

	private Date date;
	private Double valuePerHour;
	private Integer hours;

	// construtor padrão vazio
	public HourContract() {
	}

	//construtor com argumentos
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	//gethher:
	public Date getDate() {
		return date;
	}
	//sether
	public void setDate(Date date) {
		this.date = date;
	}
	//gethher:

	public Double getValuePerHour() {
		return valuePerHour;
	}
	//sether

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	//gethher:

	public Integer getHours() {
		return hours;
	}
	//sether

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	
	//DELEGAÇÃO
	//operação implementada para multiplicar e retornar quantidade de horas por valor por hora

	public double totalValue() {
		return valuePerHour * hours;
	}
}
