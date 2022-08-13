package lambdabasics.unit3;

import java.util.Arrays;
import java.util.List;

import lambdabasics.unit1Exercise.Person;

/*
 * 9 Aug 2022
 * https://youtu.be/tfbmYBcq5CM?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
 * 
 */

public class CollectionIterationExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 42), new Person("Charlotte", "Bronte", 42),
				new Person("Matthew", "Arnold", 42));
		
		//External iterators
		System.out.println("Using for loop");
		for(int i = 0; i < people.size();i++) {
			System.out.println(people.get(i));
		}

		System.out.println("Using for each");
		for(Person p : people) {
			System.out.println(p);
		}
		
		//Internal iterator from java 8
		System.out.println("Using lambda for each loop");
		//people.forEach(p -> System.out.println(p));
		people.forEach(System.out::println);
	}

}
