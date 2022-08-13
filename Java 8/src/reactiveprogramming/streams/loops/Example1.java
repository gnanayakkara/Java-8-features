package reactiveprogramming.streams.loops;

import java.util.Arrays;
import java.util.List;

/*
 * 13 Aug 2022
 */

public class Example1 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		//Java 7
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println("Java 7 : " + numbers.get(i));
		}
		
		//Java 8+ streams
		numbers.stream().forEach(number -> System.out.println("Java 8+ : " + number));
		
	}
}
