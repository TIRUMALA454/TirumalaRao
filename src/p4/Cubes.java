package p4;
import java.util.*;
import java.lang.*;

public class Cubes {
	
	
	  
	    /* Returns the sum of series */
	    public static int sumOfSeries(int n)
	    {
	        int sum = 0;
	        for (int x=1; x<=n; x++)
	            sum = x*x*x;
	        return sum;
	    }
	  
	// Driver Function
	    public static void main(String[] args)
	    {
	        int n=2;
	        System.out.println(sumOfSeries(n));
	  
	    }
	}
	
	
