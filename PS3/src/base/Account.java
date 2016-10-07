package base;
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	public Account(){
		id = 0;
		balance = 0.00;
		annualInterestRate = 0;	
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	public int getid(){
		return id;
	}

	public void setid(int id){
		this.id = id;
	}
	
	public double getbalance(){
		return balance;
	}
	
	public void setbalance(double balance){
		this.balance = balance;
	}
	
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	
	public void setannualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getdateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	public void withdraw(double amountWithdrawn) throws InsufficientFundsException{
		if (amountWithdrawn>this.balance){
			throw new InsufficientFundsException(amountWithdrawn);
		}
		if(amountWithdrawn<0){
			throw new InsufficientFundsException(amountWithdrawn);
		}
		else{
			this.balance = this.balance - amountWithdrawn;
		}
		return;
	}
	
	public void deposit(double amountDeposited) throws InsufficientFundsException{
		if (amountDeposited<0){
			throw new InsufficientFundsException(amountDeposited);
		}
		else{
			this.balance = this.balance + amountDeposited;
		}
		return;
	}
	
}
