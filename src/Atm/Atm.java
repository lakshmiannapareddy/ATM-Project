package Atm;

public class Atm {
	//declare variables as a  with in the private scope it is also know as encapsulated class
	  private double balance;
	  private double dipositAmount;
	  private double withdrawAmount;
	
	 

	public Atm() {
		super();
	
	}



	public double getBalance() {
		return balance;
	}



	
	public String toString() {
		return "Atm [balance=" + balance + ", dipositAmount=" + dipositAmount + ", withdrawAmount=" + withdrawAmount
				+ "]";
	}



	public void setBalance(double balance) {
		 this.balance = balance;
	}



	public double getDipositAmount() {
		return dipositAmount;
	}



	public void setDipositAmount(double dipositAmount) {
		this.dipositAmount = dipositAmount;
	}



	public double getWithdrawAmount() {
		return withdrawAmount;
	}



	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}



	public static void main(String[] args) {
		
	}

}
