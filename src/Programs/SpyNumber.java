//wap to print the the number is or not
//num=123
//product=1*2*3=6
//sum=1+2+3
//product==sum is spy number
package Programs;

public class SpyNumber {

	public static void main(String[] args) {
		int num=123;
		int sum=0;
		int prod=0;
		int  temp=0;
		while(num>0) {
			temp=num%10;
			sum=sum+temp;
			prod=prod*temp;
			num=num/10;
		}
		if(sum==prod)
		{
			System.out.println("The given number is spy number");
		}
		else {
			System.out.println("the given number is not a spy number");
		}
	
		
	

	}

}
