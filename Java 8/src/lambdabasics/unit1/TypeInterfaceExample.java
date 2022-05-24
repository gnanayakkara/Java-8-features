package lambdabasics.unit1;

/*
 * 23 May 2022
 */

public class TypeInterfaceExample {

	public static void main(String[] args) {
		
		/*
		 * (String s) -> s.length();
		 * (s) -> s.length();
		 * If have only one parameter no parenthesis required
		 */
		//StringLengthLambda myLambda = s -> s.length();
		//System.out.println(myLambda.getLength("Hello Lambda"));
		
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda lambda) {
		System.out.println(lambda.getLength("Hello Length"));
	}
	
	
	interface StringLengthLambda{
		int getLength(String s);
	}

}
