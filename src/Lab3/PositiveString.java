package lab3;
import java.util.Scanner;
public class PositiveString {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=scan.nextLine();
			if(checkingPositiveString(str)) {
				System.out.println("given string is positive string");
			}
			else {
				System.out.println("Given string is not positive string");
			}
		}

		private static boolean checkingPositiveString(String str) {
			boolean b=true;
			for(int i=0;i<str.length();i++) {
				for(int j=0;j<str.length();j++) {
					if(str.charAt(i)<=str.charAt(j)) {
						b=true;
					}
					else {
						b=false;
					}
				}
			}
			return b;
		}
	}

}
