package Arrays;
import java.util.Scanner;

public class CountingNumberOfvowels {
	private static int count;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		char[] ch=new char[size];
		System.out.println("enter the values in arry");
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);	
		}
        int count=0;
        for(char ch1:ch) {
        	if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') {
        		count++;
        	}
        }
        System.out.println(count);
	}
	

}
