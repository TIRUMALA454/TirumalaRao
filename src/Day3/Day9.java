package Day3;


	import java.beans.Statement;
import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	public class Day9 {
	/*
	 * Comparable(I)
	 *  default natural sorting order
	 *  java.lang pkg
	 *  provides compareTo() method
	 *  All String and Wrapper classes implements 
	 *    Comparable interface
	 *   
	 *   
	 * Comparator(I)
	 *    compare()
	 */
	//public class ComparableDemo {

		public static void main(String[] args) {

			List<Integer> al = new ArrayList<>();

			al.add(100);
			al.add(200);
			al.add(50);
			al.add(150);

			System.out.println("Before sorting: ");
			for (Integer ele : al) {
				System.out.println(ele);
			}

			Collections.sort(al);

			System.out.println();
			System.out.println("After Sorting: ");
			for (Integer ele : al) {
				System.out.println(ele);
			}

			System.out.println();
			List<String> al2 = new ArrayList<>();

			al2.add("Red");
			al2.add("Orange");
			al2.add("Black");
			al2.add("Yellow");

			System.out.println("Before sorting: ");
			for (String ele : al2) {
				System.out.println(ele);
			}

			Collections.sort(al2);
			Collections.reverse(al2);

			System.out.println();
			System.out.println("After Sorting: ");
			for (String ele : al2) {
				System.out.println(ele);
			}

			System.out.println();
			List<Statement> students = new ArrayList<>();
			students.add(new Student(1003, "Ram"));
			students.add(new Student(1002, "Sam"));
			students.add(new Student(1001, "Ravi"));
			students.add(new Student(1004, "Anu"));

			for (Student std : students) {
				System.out.println(std);
			}
			
			Collections.sort(students);
			
			System.out.println();
			for (Student std : students) {
				System.out.println(std);
			}

		}

