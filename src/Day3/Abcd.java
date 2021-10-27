package Day3;

public class Abcd {
	*/ublic class RegExDemo {

		@@ -97,11 +99,25 @@ public static void main(String[] args) {
				String str4 =  "user@gmail.com";
			    String str5 = "user_12@gmail.com";
			    String str6 = "user123@yahoo.co.in";
			    String str7 = "user1@yahoo.co.in";
			    String str8 = "123@123_.co.in";
			    //             \w\w\w\w\w\w\w@
			    //              \w\w\w\w\w@
			    //              \w\w\w\w@

			    //              a@gmail.com
			    //              \[a-zA-Z]{1,15}@\[a-zA-Z]{1,5}\.\[a-zA-Z]{1,2}
			    //  123, _ , a-z & A-Z
			    System.out.println(Pattern.matches("\\w{3,}@\\w{2,}\\.\\w{1,}", str6)); //false
			    System.out.println(Pattern.matches("\\w{3,}@\\w{2,}\\.\\w{1,}.*", str6)); //true
			    System.out.println(Pattern.matches("\\w{3,}@.*", str5)); //true


			    //String str9 = "+ 91 124 2641407 ( International call rates applicable )";
			    //String pattern = "\\+\\s\\d{2}\\s\\d{3}\\s\\d{7}\\s.*";
			    //String pattern = "\\+\\s(\\d{2})\\s(\\d{3})\\s(\\d{7})\\s\\( International call rates applicable \\)";
			    //System.out.println(Pattern.matches(pattern, str9));


			    /*
			     * flyingreturn.base@airindia.in
		@@ -118,8 +134,40 @@ public static void main(String[] args) {
			     *  + 91 124 2641407 (International call rates applicable)
			     *  
			     *  
			  
			     */
			    String str9 = "+ 91 124 2641407 ( International call rates applicable )";
			    String pattern = "\\+\\s\\d{2}\\s\\d{3}\\s(\\d{7})\\s\\( International call rates applicable \\)";

			    Pattern p1 = Pattern.compile(pattern);  
				Matcher m1 = p1.matcher(str9);
				System.out.println(m1.matches());
				System.out.println();


				System.out.println(m1.group(0));  // whole string
				System.out.println(m1.group(1)); // land line number
				//System.out.println(m1.group(2));
				//System.out.println(m1.group(3));
				//System.out.println(m1.group(4));

				if(m1.group(1).equals("2641407")) {
					System.out.println("Success");
				} else {
					System.out.println("Failure");
				}

				// find() - matches given pattern is present in entire string
				System.out.println();
				Pattern p2 = Pattern.compile("m.a");  
				Matcher m2 = p2.matcher("aasdfmxaadsfg");
				System.out.println(m2.find()); // true
				System.out.println(m2.matches()); // false
				System.out.println(m2.start()); // 5
				System.out.println(m2.end()); //8




			}

		}
		 110  src/day4/ExceptionalHandling.java 
		@@ -0,0 +1,110 @@
		
		
		
		
		package day4;/*

		import java.io.BufferedReader;
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.util.Scanner;

		/*
		 * Exceptional Handling
		 * 
		 *   stmt 1
		 *   stmt 2
		 *   stmt 3 // syntax / unexc
		 *   stmt 4
		 *   stmt 5
		 *   
		 *  Keywords:
		 *   try , catch, finally, throw, throws
		 *   
		 *  Types of exceptions
		 *   Checked  
		 *         SQLException
		 *         ClassNotFoundExcetion
		 *         IOException
		 *   Unchecked exceptions
		 *         RunTimeExcetion
		 *            ArithmeticExeption
		 *            NullPointerException
		 *            ArrayIndexOutOfBoundException
		 *            NumberFormatException
		 *            ClassCastException
		 *   
		 *  Errors - can't be handled using exceptional handling
		 *  
		 *  Parent class for exceptions - Throwable
		 *  
		 *  Throwable - Exception
		 *                 SQLException
		 *                 ClassNotFoundExcetion
		 *                 IOException
		 *                 RunTimeExcetion
		 *                     ArithmeticExeption
		 *                     NullPointerException
		 *                     ArrayIndexOutOfBoundException
		 *                     NumberFormatException
		 *                     ClassCastException
		 *              Error
		 *  
		 */
		public class ExceptionalHandling {

		    Scanner sc; // declaration -




			public static void main(String[] args)  { ;// from static area - we can access only static members

				try {
				ExceptionalHandling e = new ExceptionalHandling();

				System.out.println(e.sc);  // null


				// Instantiating
				e.sc = new Scanner(System.in);
				System.out.println(5/0);  // ArithmeticException

				// calling method
				System.out.println(e.div());

				int[] x = new int[5];
				x[0]=1;
				x[1]=2;
				x[2]=3;
				x[4]=5;  //ArrayIndexOutOfBoundException

				String str = "Hello World";
				System.out.println(str.charAt(10));  // StringIndexOutOfBoundException


				// byte values = -128 to 127
				byte y = (byte)10.45f;
				System.out.println(y);

				} catch(Exception e) {
					e.printStackTrace();
				}
				//File ff = new File("C:\\temp");
				try {
					BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} 

			}

			int div() { ;// non static area - can access both static & non static members
				//Scanner sc = new Scanner(System.in); // option1
				System.out.println("Enter first number: ");
				int num1 = sc.nextInt();
				System.out.println("Enter second number");
				int num2 = sc.nextInt();
				int result= num1/num2;
				//System.out.println(result);
				return result;
			}

		}
}
