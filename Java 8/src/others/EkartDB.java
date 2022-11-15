package others;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 11 Nov 2022
 */

public class EkartDB {

	public static List<Customer> getAll() {
		return Stream.of(new Customer(101, "John", "john@gmail.com", Arrays.asList("12346789", "45678931")),
						new Customer(102, "Smith", "smith@gmail.com", Arrays.asList("87945600", "465897461")),
						new Customer(103, "peter", "peter@gmail.com", Arrays.asList("4897189", "541269531")),
						new Customer(104, "keyly", "keyly@gmail.com", Arrays.asList("12312324", "34423121323")))
				.collect(Collectors.toList());
	}
}
