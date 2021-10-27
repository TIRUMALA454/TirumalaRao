package Lab4;

import java.security.Permission;

public class CurrentAccount extends Account{
	double overDtaft=2000;
	public CurrentAccount(Permission p) {
		super(p );
		
	}

	
	@Override
	boolean withDraw(double d) {
		
		if(d>overDtaft){
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
