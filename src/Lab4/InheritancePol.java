package lab4;

import java.lang.Math;
public class InheritancePol {
	public static void main(String[] args) {
		
		Person p=new Person();
		p.setName("smith");
		p.setAge(30);
		
		
		SavingsAccount s=new SavingsAccount(p);
		s.setAccNumber((long) Math.random());
		s.setBalance(2000);
		s.deposite(s.getBalance());
		
		Person p1=new Person();
		p1.setName("Kathy");
		p.setAge(25);
		
		
		SavingsAccount s1=new SavingsAccount(p1);
		s1.setAccNumber((long) Math.random());
		s1.setBalance(3000);
		System.out.println(s1.withDraw(s1.getBalance()));
		Account a=new Account(p1);
		a.withDraw(s1.getBalance());
		
		CurrentAccount c=new CurrentAccount(p1);
		System.out.println(c.withDraw(c.getBalance()));
		
	}
		
}