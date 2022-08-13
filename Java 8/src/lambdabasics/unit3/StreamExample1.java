package lambdabasics.unit3;

import java.util.Arrays;
import java.util.List;

import lambdabasics.unit1Exercise.Person;

/*
 * 9 Aug 2022
 * https://youtu.be/0bHCxjkku0s?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
 */

public class StreamExample1 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 42), new Person("Charlotte", "Bronte", 42),
				new Person("Matthew", "Arnold", 42));
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		long count = people.stream()
		.filter(p -> p.getLastName().startsWith("C")).count();
		
		System.out.println(count);
		
		//When have multiple cores
		long count2 = people.parallelStream()
				.filter(p -> p.getLastName().startsWith("C")).count();

	}

}
