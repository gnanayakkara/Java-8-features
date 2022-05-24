package lambdabasics.unit1Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 24 May 2022
 */

public class Unit1ExerciseJava7 {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 42),
				new Person("Charlotte", "Bronte", 42),
				new Person("Matthew", "Arnold", 42)
				); 
		
		// Step 1 sort list by last name
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			};
		});
		
		// Step 2 create a method that prints all the elements in the list
		printAll(people);

		// Step 3 Create a method that prints all the people that have last name beginning with C
		System.out.println("Print all the people with last Name begining with c");
		printConditionally(people,new Condition() {
			
			@Override
			public boolean test(Person person) { 
				return person.getLastName().startsWith("C");
			}
		});
		
		// Step 4 Create a method that prints all the people that have last name beginning with C
		System.out.println("Print all the people with First Name begining with c");
		
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person person) {
				// TODO Auto-generated method stub
				return person.getFirstName().startsWith("C");
			}
		});
		
	}

	private static void printConditionally(List<Person> people,Condition condition) {
		
		for(Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
	}

	private static void printAll(List<Person> people) {
		
		for(Person person : people) {
			System.out.println(person);
		}
	}

}

@FunctionalInterface
interface Condition{
	boolean test(Person person);
}
