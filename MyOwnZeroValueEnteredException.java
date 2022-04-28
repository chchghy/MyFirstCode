package assertexample;

public class MyOwnZeroValueEnteredException extends ArithmeticException{

	public MyOwnZeroValueEnteredException() {
		System.out.println(" EnteredException :"+0);
	}
}
