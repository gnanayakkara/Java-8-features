package interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * 15 Nov 2022
 */

public class FindDuplicateAndPrint {

	public static void main(String[] args) {

		List<String> input = Arrays.asList("A", "B", "A", "C", "D", "D", "D");

		input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).forEach(System.out::println);

	}

}
