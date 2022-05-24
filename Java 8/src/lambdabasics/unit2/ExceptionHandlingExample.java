package lambdabasics.unit2;

import java.util.function.BiConsumer;

/*
 * 24 May 2022
 * https://youtu.be/YLKMCPMLv60?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
 */

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int[] someNumbers = {1,2,3,4};
		int key = 0;
		
		process(someNumbers,key, wrapperLambda((v,k) -> System.out.println("Okay : "+v/k)));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		
		for(int i : someNumbers) {
			System.out.println("no 1");
			consumer.accept(i, key);
		}
		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		
		return (v,k) -> {
			try {System.out.println("no 2");
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}
}
