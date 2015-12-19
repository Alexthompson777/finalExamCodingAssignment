package ch.makery.address.model;

import domain.RateDomainModel;
import org.apache.poi.ss.formula.functions.FinanceLib;


public class Rate extends RateDomainModel {
	
	public double pV;
	public double iV;
	
	public double income;
	public double monthlyExpenses;
	public double creditScore;
	public double houseCost;
	
	public String years;
	
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getMonthlyExpenses() {
		return monthlyExpenses;
	}
	public void setMonthlyExpenses(double monthlyExpenses) {
		this.monthlyExpenses = monthlyExpenses;
	}
	public double getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(double creditScore) {
		this.creditScore = creditScore;
	}
	public double getHouseCost() {
		return houseCost;
	}
	public void setHouseCost(double houseCost) {
		this.houseCost = houseCost;
	}
	
	
	public double getpV() {
		return pV;
	}
	public void setpV(double pV) {
		this.pV = pV;
	}
	public double getiV() {
		return iV;
	}
	public void setiV(double iV) {
		this.iV = iV;
	}
	
	public double getPayment(double NumberOfPayments)
	{
		//FinalExam
		//	Normally this kind of method would be in a BLL, but alas...
		
		//	Figure out payment based on:
		//	Interest rate
		//	PV
		//	FV (make FV = 0, unless you want a balloon payment
		//	Compounding = True
		//	Number of Payments (passed in)
		
		double monthlyRate = iV/1200;
		return FinanceLib.pmt(monthlyRate, NumberOfPayments, pV, 0.0, false);
		
	}
	public double mortgage(){
		return ;
		
	}
}
