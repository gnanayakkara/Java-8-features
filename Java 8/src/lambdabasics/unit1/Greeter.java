package lambdabasics.unit1;

/*
 * 22 May 2022
 */

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.performe();
	}

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		
		Greeting lambdaGreeting = () -> System.out.println("Hello world");
		
		Greeting innerClassGreeting = new Greeting() {
			
			public void performe() {
				System.out.println("Hello World!");
			}
		};
		
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
	}

}

