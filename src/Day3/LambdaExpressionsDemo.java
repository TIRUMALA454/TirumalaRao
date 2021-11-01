package Day3;

//public class LambdaExpressionsDemo {
	
	/*
	 * Lambda expression requires functional interface
	 *   
	 * functional interface  - contains only one abstract method
	 * @FunctionalInterface - optional
	 */

	@FunctionalInterface
	interface Intf1 {
		int add(int x, int y);
	}

	@FunctionalInterface
	interface Intf2 {
		String hello(String name);
	}

	@FunctionalInterface
	interface Intf3 {
		void hello();
	}

	@FunctionalInterface
	interface Intf4 {
		boolean isEven(int num);
	

	//public class LambdaExpressionsDemo {

		public static void main(String[] args) {
			// int add(int x, int y) {
			// return x+y;
			// }
			// lambda
			Intf1 refVar = (x, y) -> x + y;
			System.out.println(refVar.add(100, 100));

			// Example 2
			// String hello(String name) {
			// return "Hello "+name;
			// }

			// lambda expression
			Intf2 refVar2 = name -> "Hello " + name;
			System.out.println(refVar2.hello("Ram"));

			// Example 3
//			void hi() {
//				System.out.println("Hello World!");
//			}

			// Lambda expression
			Intf3 refVar3 = () -> System.out.println("lambda expression!");
			refVar3.hello();

			// Example 4
//			boolean isEven(int num) {
//				if(num%2==0) {
//					return true;
//				} else {
//					return false
//				}
//			}
			Intf4 refVar4 = num -> {
				if (num % 3 == 0) {
					return true;
				} else {
					return false;
				}
			};
			
			System.out.println(refVar4.isEven(15));
	}
	}
