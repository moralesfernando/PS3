package ps3;

public class InsufficientFundsException extends Exception {
	
	private double amount;

	public InsufficientFundsException(double amount){
		this.amount = amount;
	}
	
	public double getamount() {
		return amount;
	}
}
