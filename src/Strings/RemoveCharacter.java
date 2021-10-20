//wap to print to remove the given character from the given string

package Strings;
import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string ");
		String s=scan.next();
		System.out.println("entr a character");
		char ch=scan.next().charAt(0);
		String str="";
		for(int i=0;i<s.length();i++)
		{
		 if(!(s.charAt(i)==ch))
		 {
			str=str+s.charAt(i) ;
		 }
		

	}
		System.out.println(str);
}

}