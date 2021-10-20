// wap to print the array 
package pack1;

import java.util.ArrayList;
import java.util.List;

import Arrays.Function;

public class C {
	public static void main(String []args) {
	public static List<Integer> map(List<Integer> array, Function<Integer, Integer> method)

	{

	List<Integer> result = new ArrayList<>(); for (int element: array)
	{ 
		method.apply(element); 
		
	}
	return result;
	

}
}

