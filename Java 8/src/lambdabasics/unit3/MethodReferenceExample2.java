package lambdabasics.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lambdabasics.unit1Exercise.Person;

/*
 * 9 Aug 2022
 * https://youtu.be/lwwIZuwYmNI?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
 */

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 42), new Person("Charlotte", "Bronte", 42),
				new Person("Matthew", "Arnold", 42));


		performConditionally(people, p -> true, System.out::println);

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {

		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}