package lab9;
interface Inf{
	int pow(int a,int b);
}
public class XandY {
    public static void main(String[]args) {
    	Inf res=(a,b) -> a^b;
    	System.out.println((int)Math.pow(2, 2));
    	System.out.println(res);
    }
}
