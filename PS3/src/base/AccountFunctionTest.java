package base;

import java.text.DecimalFormat;

import static org.junit.Assert.*;
import org.junit.Test;

import base.Account;
import base.InsufficientFundsException;


public class AccountFunctionTest {
	
	@Test
	public void test(){
		Account testCondition = new Account(1122,20000.00); 
		testCondition.setannualInterestRate(0.045);
		
		try{
			testCondition.withdraw(2500.00);
		}
		catch (InsufficientFundsException e){
			System.out.println("Insufficient Funds");
		}
		
		assertTrue(testCondition.getbalance() == 17500.00);
		
		try{
			testCondition.deposit(3000.00);
		}
		catch (InsufficientFundsException e){
			System.out.println("Insufficient Funds");
		}
		assertTrue(testCondition.getbalance() == 20500.00);//this balance takes withdrawal into account
		
		DecimalFormat money = new DecimalFormat("$0.00");
		System.out.println("Account Balance is " + money.format(testCondition.getbalance()));
		System.out.println("Monthly Interest Rate is " + testCondition.getMonthlyInterestRate()*100);
		System.out.println("Date Created is " + testCondition.getdateCreated());
		}
}