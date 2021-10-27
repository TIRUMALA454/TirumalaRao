package Lab4;

import java.security.Permission;

public class Account {
	private  long accNumber;
	private double balance;
	Permission accHolder;
	
	
	
	public Account(Permission accHolder) {
		super();
		
		this.accHolder = accHolder;
	}
	
	//methods
	void deposite(double d) {
		this.balance=d+2000;
		System.out.println("2000 wiil be deposited in the :"+accHolder.getName()+" account available balance is"+this.balance);
	}
	boolean withDraw(double d) {
		if(d<500) {
			System.out.println("withdraw is not possible in this account"+accHolder.getName());
			return false;
		}
		else {
			this.balance=d-2000;
			System.out.println(" After withdraw tha available balance in "+this.accHolder.getName()+" account is "+this.balance);
			return true;
		}
		
	}
	
	//getters and setters
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}