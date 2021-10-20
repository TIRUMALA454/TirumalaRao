//wap to print the  given number is perfect or not?
package Programs;

public class PerfectNumber {

	public static void main(String[] args) {
	    int num=10;
	    int sum=0;
	    for(int i=1;i<num;i++) {
	    	if(num%i==0)
	    		sum=sum+i;
	    }
         if(sum==num) {
        	 System.out.println("perfect number");
        	 
         }
         else {
        	 System.out.println(" not a perfect number");
        	 
         }
	}

}
