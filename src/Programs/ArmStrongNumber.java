//wap to print the given number is armstrong number or not
package Programs;

public class ArmStrongNumber {
	public static void main(String[]args) {
	   int num=153;
	   int rem;
	   int sum=0;
	   int temp=num;
	   while(num>0) {
		   rem=num%10;
		   sum=sum+(rem*rem*rem);
		   num=num/10;
	   }
	   if(temp==sum) {
		   System.out.println("given number is Armstrong Number");
	   }
	   else {
		   System.out.println("given number is not a  Armstrong Number");
		   
	   }
	}

}
