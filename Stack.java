/**
 * This class inherits from List class to perform its stack operation
 * 
 * CSS143C: Linked Lists, Stacks, & Queues
 * @author kraynguyen1
 * @version 3/4/2020
 *
 */
public class Stack extends List{

	public Stack() {
		// no arg constructor
	}
	
/**
 * This method calls parent method to insert the object at the beginning of the list
 * @param obj
 * 
 * @precondition: obj is valid 
 * @postcondition: object added to front list
 */
	public void push(Object obj) {
		super.insert(obj, super.size());
	}

/**
 * This method calls parent method to removes the object at the last in the list. First in Last out 
 * 
 * @return last object in the list
 */
	public Object pop(){
		return super.remove(super.size() - 1);
	}

/**
 * This override method inserts the object at the beginning of the list
 * @param obj
 * 
 * @precondition: obj is valid 
 * @postcondition: the object is added to the front of the list 
 */
	public void insert(Object obj) {
		push(obj);
	}

	/**
	 * This override method removes the object at the last in the list
	 * @return the last object in the list
	 */
	public Object remove() {
		return pop();
	}
	
	/**
	 * this overide method check if the stack is empty
	 * @return true or false
	 */
	public boolean isEmpty() {
		return super.isEmpty();
	}
}
