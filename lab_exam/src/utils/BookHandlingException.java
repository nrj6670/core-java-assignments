package utils;

@SuppressWarnings("serial")
public class BookHandlingException extends Exception{
	//constructor that obtains message 
	public BookHandlingException(String message) {
		//the message obtained is passed to the super class constructor using super keyword..
		//to invoke the superclass constructor
		super(message);
	}
}
