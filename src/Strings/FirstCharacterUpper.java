//write a program to print the first character is upper case remaining 
//characters are lower case and also print alternative
package Strings;
import java.util.Scanner;

public class FirstCharacterUpper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		String str="";
		str=(s.charAt(0)+"").toUpperCase();
		for(int i=1;i<s.length();i++) {
			
			//str=str+(s.charAt(i)+"").toLowerCase();
			if(i%2==0) {
				str=str+(s.charAt(i)+"").toUpperCase();
			}
			else {
				str=str+(s.charAt(i)+"").toLowerCase();
			}
		}
		System.out.println(str);
        
         }

}
