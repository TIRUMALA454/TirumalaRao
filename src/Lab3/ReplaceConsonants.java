package Lab3;


	public class ReplaceConsonants {
		public static void main(String[] args) {
			String str="java";
			replace(str);
			
		}

		private static void replace(String str) {
			// TODO Auto-generated method stub
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
					str=str.replace(ch, (char) (ch+1));
				}
			}
			System.out.println(str);
			
		}

}
