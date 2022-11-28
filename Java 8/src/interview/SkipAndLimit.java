package interview;

import java.util.Arrays;
import java.util.List;

/*
 * 18 Nov 2022
 */

public class SkipAndLimit {

	public static void main(String[] args) {
		
		List<Integer> array = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		array.stream().skip(1).limit(7).forEach(System.out::println);
		
	}
}
