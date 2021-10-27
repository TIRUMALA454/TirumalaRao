package Lab2;



	public class SecondHigh {
		public static int secondLargest(int[] a,int num){  
			int temp;  
			for (int i=0;i<num;i++){  
				for (int j=i+1;j<num;j++){  
			        if (a[i] > a[j]){  
			            temp = a[i];  
			            a[i] = a[j];  
			            a[j] = temp;
			        }
				}
			}
			return a[num-2];
		}
		public static void main(String[] args) {
			int[] arr= {5,767,4,45,6};
			System.out.println(secondLargest(arr,arr.length));
		}
			            
			            

	}


