//wap to print the febonaic series
package Programs;

public class FabonacciSeries {

	public static void main(String[] args) {
		int n=0;
		int n1=1;
		int sum=0;
		for(int i=2;i<=10;i++)
		{
			sum=n+n1;
			System.out.println(sum);
			n=n1;
			n1=sum;
		}
		

	}
}
