package Strings;

public class NumberOfOccurance {

	public static void main(String[] args) {
		String s="java";
		String str=" ";
	for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
					if(str.indexOf(ch)==-1) {
						str=str+ch;
					}
			
		}
		System.out.println(str);
		for(int i=1;i<str.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(str.charAt(i)==s.charAt(j)) {
					count ++;
				}
			}
			System.out.println(str.charAt(i)+"is"+count);
		}
	}

}
