package entities;

import java.time.LocalDate;

public class Installment {

	private LocalDate Date;
	private Double amount;
	
	public Installment() {
	}
	
	public Installment(LocalDate date, Double amount) {
		Date = date;
		this.amount = amount;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Installment [Date=" + Date + ", amount=" + amount + "]";
	}
	
	
	
}
