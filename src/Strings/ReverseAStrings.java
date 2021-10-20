package Strings;

public class ReverseAStrings {

	public static void main(String[] args) {
		String s="hello java world";
		String s1[]=s.split(" ");
		//for(int i=0;i<s1.length;i++) {
			//System.out.println(s1[i]);
		//}
		
		for(int i=0;i<s1.length;i++) {
	         String str=s1[i];
	         String rev=" ";
	         for(int j=0;j<str.length();j++)
	         {
	        
	        rev=str.charAt(j)+rev;
	         }
	         
			System.out.print(rev+"");
		}
	}
	}
