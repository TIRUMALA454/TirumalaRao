//wpa to print given string is pallindrom or not
package Strings;
import java.util.Scanner;
public class pallindromOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string...");
	  String s=sc.next();
	  String str="";
	  for(int i=0;i<s.length();i++) {
		  char ch=s.charAt(i);
		  str=ch+str;
	  }
	  System.out.println(str);
	if(str.equals(s)) {
		System.out.println("given string is pallindrom");
	}
		else {
			System.out.println("given string not  is pallindrom");
		}}}