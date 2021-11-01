package lab4;

import java.security.Permission;

public class SavingsAccount extends Account{
	final double minBal1=2500;
	public SavingsAccount(Permission accHolder) {
		super(accHolder);
	
	}

	
	final double minBal=500;

	@Override
	boolean withDraw(double d) {
		
		if(d>=minBal1) {
			return true;
		}
		else {
			return true;
		}
	}
	 
	 

}