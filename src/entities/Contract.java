package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate date;
	private Double totalValeu;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Contract() {
	}

	public Contract(int number, LocalDate date, Double totalValeu) {
		this.number = number;
		this.date = date;
		this.totalValeu = totalValeu;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValeu() {
		return totalValeu;
	}

	public void setTotalValeu(Double totalValeu) {
		this.totalValeu = totalValeu;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

}
