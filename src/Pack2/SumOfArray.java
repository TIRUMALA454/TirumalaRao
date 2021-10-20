package Pack2;

public class SumOfArray {
	
	    public static void main(String[] args) {      
	    	
	        int [] arr = new int [] {10,11,12,13,14};   
	        int sum = 0;  
	          
	        //to calculate sum of elements  
	        for (int i = 0; i < arr.length; i++) {   
	           sum = sum + arr[i];  
	        }    
	        System.out.println("Sum of an array: " + sum);  
	    }  
	}  

