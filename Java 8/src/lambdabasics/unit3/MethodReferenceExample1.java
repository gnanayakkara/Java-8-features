package lambdabasics.unit3;

/*
 * 9 Aug 2022
 */

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		Thread thread = new Thread(MethodReferenceExample1::printMessage);//MethodReferenceExample1::printMessage == = () -> printMessage()
		thread.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
