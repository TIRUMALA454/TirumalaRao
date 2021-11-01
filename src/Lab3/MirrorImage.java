package lab3;


	import java.util.Scanner;

	public class MirrorImage {
		public static void main(String[] args) {
			Scanner word= new Scanner(System.in);
			System.out.println("Enter the string");
			String s=word.nextLine();
			mirrorImage(s);
		}

		private static void mirrorImage(String s) {
			String rev=" ";
			for(int i=0;i<=s.length()-1;i++) {
				rev=s.charAt(i)+rev;
			}
			System.out.println("mirror image of thestring is");
			System.out.println(s+"|"+rev);
			
		}

	}


