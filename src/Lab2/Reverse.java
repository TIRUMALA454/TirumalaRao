package lab2;



	public class Reverse {
		public static void main(String[] args) {
			int[] arr= {56,7436,765,42};
			for(int i=0;i<arr.length;i++) {
				arr[i]=reverse(arr[i]);
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
		public static int reverse(int num) {
			int rev=0,rem;
			while(num>0) {
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			return rev;
			
		}
	}

