package others;

import java.util.List;
import java.util.stream.Collectors;

/*
 * 11 Nov 2022
 */

public class MapVsFlatMap {

	public static void main(String[] args) {
		
		List<Customer> customers = EkartDB.getAll();
		
		//Only emails. Data Transformation
		List<String> emails = customers.stream().map(customer -> customer.getEmail() ).collect(Collectors.toList());
		System.out.println(emails);
		
		
		List<String> phoneNumbers = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(phoneNumbers);
	}
	
	
}

