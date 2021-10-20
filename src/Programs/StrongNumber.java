package Programs;


public class StrongNumber {
	public static void main(String[]args) {
	int num=145;
	int rem;
	int sum=0;
	int n=num;
	
	 int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
		
	}
	while(num>0)
	{
		rem=num%10;
		sum=sum+fact(rem);
		num=num/10;
	}
    System.out.println(fact);
	}
}
