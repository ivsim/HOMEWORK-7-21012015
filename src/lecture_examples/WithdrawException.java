package lecture_examples;

// first we need to define the exception -> the way to go is inherit Exception class...

public class WithdrawException extends Exception {

	public WithdrawException(){
		super();
	}
	
	public WithdrawException(String message){
		super(message);
	}
	
}
