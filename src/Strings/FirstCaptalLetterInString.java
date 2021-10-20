package Strings;

public class FirstCaptalLetterInString {

	public static void main(String[] args) {
	   String s="hello World";
	   String[]s1=s.split(" ");
	   for(int i=0;i<s1.length;i++) {
		   String s2=s1[i];
		   String s3="";
		   String s4=(s2.charAt(0)+s3).toUpperCase();
		   for(int j=1;j<s2.length();j++) {
			s4=s4+(s2.charAt(j)+s3).toLowerCase();
		   }
		   System.out.print(s4+" ");
		   
	   }
	   
	   
	   

	}

}

