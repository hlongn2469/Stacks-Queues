/**
 * This superclass implements node and references to create a linked list rather than using arrays
 * Outer class: List . Inner class: Node
 * CSS143C: Linked Lists, Stacks, & Queues
 * @author kraynguyen1
 * @version 3/4/2020
 */
public class List{
	
	private Node head;
	
	/**
	 * Constructor setting head to null
	 */
	public List() {
		head = null;
	}
	
	private class Node{
		
		// references to next link and data
		private Node next;
		private Object data;
		
		/**
		 * constructor setting next link and data to null
		 */
		public Node() {
			next = null;
			data = null;
		}
		
		/**
		 * Constructor setting data
		 * @param newData
		 */
		public Node(Object newData) {
			data = newData;
		}
		
		/**
		 * Constructor setting next link and data
		 * @param next
		 * @param newData
		 */
		public Node(Node next, Object newData) {
			data = newData;
			this.next = next;
		}
	}

/**
 * This method inserts the object at specified index
 * @param next
 * @param index
 * 
 * @precondition: none
 * @postcondition: Object inserted at index
 */
	public void insert(Object next, int index) {
		try {
			// check for extreme cases 
			if(index < 0) {
				throw new LinkedListException("Check index");
			}
			if(next == null) {
				throw new LinkedListException("Object data can't be null");
			}
			
			// if an empty list, add the object to the head and point to next node
			if(head == null) {
				head = new Node(next);
			
			// insert at the front
			} else if (index == 0) {
				Node nextNode = new Node();
				
				// move the current head node to next node
				nextNode = head;
				head.next = nextNode;
				
				// replace current head node with the newly created node
				head = new Node(next);
			
			// insert in the middle 
			} else if(index > 0 && head.next != null) {
				// Let say we have Node [1,2,3,4] and called insert(5,2)
				int currentPos = 0;
				
				// create the inserting node with given object
				// Node [1,2,3,4,5]
				Node insertNode = new Node(next);
				
				// this temp node pointed at the head
				// Node[1(prevNode), 2, 3, 4, 5]
				Node prevNode = new Node();
				prevNode = head;
				
				// traverse until the index before the insert 
				// Node[1,2(prevNode),3,4,5]
				while(currentPos < index -1 ) {
					prevNode = prevNode.next;
					currentPos++;
				}
				
				// previous node points to current 
				// Node[1,2[prev],3[current],4,5]
				Node currentNode = new Node();
				currentNode = prevNode.next;
				
				
				// inserted Node points to current node
				insertNode.next = currentNode;
				
				// previous nodes now point to insert Node
				prevNode.next = insertNode;
				//Node[1,2[prev],5[insert],3[current],4] DONE!
				
			// insert at the end 
			} else if(head.next == null) {
				// create the inserting node
				Node insertNode = new Node(next);
				
				// last node points to the head
				Node lastNode = head;
				
				// traverse and update last node until reaching the end
				while(lastNode.next != null) {
					lastNode = lastNode.next;
				}
				
				// the actual last node will point to insert node
				lastNode.next = insertNode;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

/**
 * This method removes the object at specified index
 * @param index
 * @return object at index
 */
	public Object remove(int index) {
		Object retVal = null;
		
		try {
			
			// check for extreme case
			if(index < 0) {
				throw new LinkedListException("Check index plz");
			}
			// if empty list
			if(head == null) {
				throw new LinkedListException("Empty list. Can't remove");
			
			// remove at the front
			} else if(index == 0) {
				retVal = head.data;
				Node nextNode = head.next;
					
				this.head = nextNode;

			} else if(index > 0 && head.next != null) {
				Node current = this.head;
                for(int i = 0; i < index-1; i++){
                    current=current.next;
                }
                current.next = current.next.next;
			}
			
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return retVal;
	}

/**
 * This getter method gives the size of the list 
 * @return size
 */
	public int size()  {
		int count = 0;
			Node current = head;
			while(current != null) {
				count++;
				current = current.next;
		}
		return count;
	}

/**
 * This method collects data from each node and turns it into the string
 * @return String data
 */
	public String toString() {
		String val = "";
		Node current = head;
		
		while(current != null) {
			val += current.data + " ";
			current = current.next;
		}
		return val;
	}

/**
 * This method reports if the list is empty or not
 * @return true or false
 */
	public boolean isEmpty() {
		if(head == null) {
			return true;
		} else {
			return false;
		}
	}

/**
 * This method gives the index of target Object in the list. Starts at 0. Return -1 if not found
 * @param target
 * @return index of target
 */
	public int indexOf(Object target) {
		int index = -1;
		int count = -1;
		Node current = head;
		while(current != null) {
			count++;
			if(current.data.equals(target)) {
				index = count;
			}
			current = current.next;
			
		}
		return index;
	}

/**
 * This method adds to the end of the list
 * @param obj
 * @throws LinkedListException
 * 
 * @precondition: none
 * @postcondition: object added to the end of the list
 */
	public void append(Object obj) throws LinkedListException {
		if(obj == null) {
			throw new LinkedListException("Object cant be null");
		}
		Node current = head;
	      if(current != null) {
	         while(current.next != null) {
	            current = current.next;      
	         }
	         current.next = new Node(null,obj);
	      } else if(current == null) {
	         Node newNode = new Node(null,obj);
	         head = newNode;
	      }
	   }
}
