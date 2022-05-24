package lambdabasics.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 24 May 2022
 */

public class Unit2ExerciseJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 42), new Person("Charlotte", "Bronte", 42),
				new Person("Matthew", "Arnold", 42));

		// Step 1 sort list by last name
		Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2 create a method that prints all the elements in the list
		printConditionally(people, p -> true);

		// Step 3 Create a method that prints all the people that have last name
		// beginning with C
		System.out.println("Print all the people with last Name begining with c");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		// Step 4 Create a method that prints all the people that have last name beginning with C
		System.out.println("Print all the people with First Name begining with c");

		printConditionally(people, p -> p.getFirstName().startsWith("C"));
		
	}

	private static void printConditionally(List<Person> people, Condition condition) {

		for (Person person : people) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
	}

}
