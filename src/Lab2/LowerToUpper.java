package Lab2;


	public class LowerToUpper {
		public static void main(String[] args) {
			
			String str="hello world";
			String[] arr=str.split(" ");
			for(int i=0;i<arr.length;i++) {
				if(i<=arr.length/2-1) {
					arr[i]=upperCase(arr[i]);			
				}
				else {
					arr[i]=lowerCase(arr[i]);
				}
			}
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]);
			}
		}

		private static String lowerCase(String string) {
			
			return string.toLowerCase();
		}

		private static String upperCase(String string) {
			return string.toUpperCase();
		}
		

	}

