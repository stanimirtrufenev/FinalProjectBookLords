package exceptions;

public class InvalidDataException extends Exception {

	private static final long serialVersionUID = -3938162429397772071L;

	public InvalidDataException() {
		super();
	}

	public InvalidDataException(String message, Exception arg1) {
		super(message, arg1);
	}

	public InvalidDataException(String message) {
		super(message);
	}

	public InvalidDataException(Exception arg0) {
		super(arg0);
	}
	
	
}
