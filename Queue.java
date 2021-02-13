/*
 * This class inherits from List class to perform its queue operation
 * 
 * CSS143C: Linked Lists, Stacks, & Queues
 * @author kraynguyen1
 * @version 3/4/2020
 *
 */
public class Queue extends List{

	public Queue() {
		// no arg constructor
	}
	
	/**
	 * This method calls parent method to inserts the object to the front
	 * @param obj
	 * 
	 * @precondition: obj is valid 
	 * @postcondition: object added to front list
	 */
	public void enqueue(Object obj) {
		super.insert(obj, super.size());
	}
	
	/**
	 * This method calls parent method to removes the first element in the list. First in first out
	 */
	public Object dequeue () {
		return super.remove(0);
	}
	
	/**
	 * This overide method inserts the object to the front
	 * @param obj
	 * @precondition: obj is valid 
	 * @postcondition: object added to front list
	 */
	public void insert(Object obj) {
		enqueue(obj);
	}
	
	/**
	 * This method removes the first element in the list. First in first out
	 * @return first object in the list
	 */
	public Object remove() {
		return dequeue();
	}
	
	/**
	 * this override method check if the queue is empty
	 * @return true or false
	 */
	public boolean isEmpty() {
		return super.isEmpty();
	}
}
