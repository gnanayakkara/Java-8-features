package lambdabasics.unit1Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
 * 24 May 2022
 * https://youtu.be/yubVRLP9Htw?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
 */

public class Unit2ExerciseJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 42), new Person("Charlotte", "Bronte", 42),
				new Person("Matthew", "Arnold", 42));

		// Step 1 sort list by last name
		Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2 create a method that prints all the elements in the list
		performConditionally(people, p -> true,p -> System.out.println(p));

		// Step 3 Create a method that prints all the people that have last name
		// beginning with C
		System.out.println("Print all the people with last Name begining with c"); 
		performConditionally(people, p -> p.getLastName().startsWith("C"),p -> System.out.println(p));
		
		// Step 4 Create a method that prints all the people that have last name beginning with C
		System.out.println("Print all the people with First Name begining with c");

		performConditionally(people, p -> p.getFirstName().startsWith("C"),p -> System.out.println(p.getFirstName()));
		
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,Consumer<Person> consumer) {

		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}
