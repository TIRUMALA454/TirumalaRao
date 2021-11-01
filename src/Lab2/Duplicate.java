package lab2;


	import java.util.Arrays;
	import java.util.Scanner;

	public class Duplicate {
		public static void main(String[] args) {
			Scanner scn= new Scanner(System.in);
			System.out.println("Enter the size of an array: ");
			int length= scn.nextInt();
			int[] arr= new int[length];
			System.out.println("Enter  elements in array: ");
			for(int i=0; i<length; i++)  
			{  
				arr[i]=scn.nextInt();  
			}
			System.out.println("Original Array is: ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			removeDuplicate(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}

		}
		
		public static int[] removeDuplicate(int[] arr) {
			for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						arr[j]=0;
					}
				}
			}
			System.out.println("After removing duplicate elements: ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			System.out.println("Sorted Array after removing duplicate elements is: ");
			Arrays.sort(arr);
			return arr;
		}

	}

