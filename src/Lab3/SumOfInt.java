package Lab3;


	import java.util.*;
	public class SumOfInt {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
			System.out.println("enter the value that must be integer");
			String num=s.nextLine(); 
			sumOfValues(num);
		}

		private static void sumOfValues(String num) {
			int sum=0;
			for(int i=0;i<=num.length()-1;i++) {
				char ch=num.charAt(i);
				if(ch>='0'&&ch<='9') {
					int j=Integer.parseInt(ch+"");
					sum=sum+j;
				}
			}
			System.out.println(sum);
		}

	}
