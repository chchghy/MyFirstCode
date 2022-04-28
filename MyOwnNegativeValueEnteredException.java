package assertexample;

public class MyOwnNegativeValueEnteredException extends ArithmeticException{

	private int negativeNumber;
	
	public MyOwnNegativeValueEnteredException(int negativeNumber) {
		this.negativeNumber=negativeNumber;
	    System.out.println(" EnteredException :"+negativeNumber);
	}
}
