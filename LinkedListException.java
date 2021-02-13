/* This custom class inherits from Exception class to perform linkedlistexception
 * 
 * CSS143C: Linked Lists, Stacks, & Queues
 * @author kraynguyen1
 * @version 3/4/2020
 */
public class LinkedListException extends Exception{
	
	/**
	 * Calling parent constructor 
	 */
	public LinkedListException() {
		super();
	}
	
	/**
	 * Calling parent constructor taking in string message
	 * @param message
	 */
	public LinkedListException(String message) {
		super(message);
	}

}
