
/**
 * This class is used for testing List, Stack and Queue
 * Uncomment each part to test 
 * 
 * CSS143C: Linked Lists, Stacks, & Queues
 * @author Kray Nguyen
 * @version (3/4/2020)
 *
 */
public class LLDriver {
	public static void main(String[] args) throws LinkedListException {
		
		System.out.println("LIST TESTING: \n");
		List empty = new List();
		List one = new List();
		List multiple = new List();
		
		try {
			one.append(5);
			multiple.append(10);
			multiple.append(20);
			multiple.append(30);
			multiple.append(40);
			multiple.append(null);// this should throw an error message
		} catch (LinkedListException e) {
			System.out.println("can't append null object");
		}

		System.out.println("Empty: " + empty); // ( note the implicit call to toString())
		System.out.println("Empty size: " + empty.size());
		System.out.println("Empty is empty? : " + empty.isEmpty());
		System.out.println("------------------------------------------");
		System.out.println("One:" + one);
		System.out.println("One size: " + one.size());
		System.out.println("One is empty? " + one.isEmpty());
		
		System.out.println("------------------------------------------");
		System.out.println("Multiple:" + multiple);
		System.out.println("Multiple size:" + multiple.size());
		System.out.println("Multiple is empty? " + multiple.isEmpty());
		System.out.println("------------------------------------------");
		one.remove(0);
		multiple.remove(1);
		multiple.remove(20);// this should throw an error message
		System.out.println("One (upon delete):" + one);
		System.out.println("One size: " + one.size());
		System.out.println("Multiple (upon delete):" + multiple);
		System.out.println("Multiple size (upon delete):" + multiple.size());
		System.out.println("------------------------------------------");
		
		one.insert(600, 2);
		one.insert(400, 1);
		multiple.insert(400, 1);
		System.out.println("One (on insert):" + one);
		System.out.println("Multiple(on insert):" + multiple);
		
		multiple.remove(3);
	
		System.out.println("Multiple(on remove):" + multiple);
		System.out.println("Index " + multiple.indexOf(30));
		System.out.println("Index " + multiple.indexOf(11));

		
		
//		  System.out.println("\n STACK TESTING: \n"); Stack empty = new Stack(); Stack
//		  one = new Stack(); Stack multiple = new Stack();
//		  
//		  one.push(5); multiple.push(10); multiple.push(20); multiple.push(30);
//		  multiple.push(40); // multiple.push(null);// this should throw an error
//		  multiple.insert(999, 3);// this should throw an error message //
//		  multiple.append(222);// this should throw an error message //
//		  multiple.remove(25);// this should throw an error message
//		  
//		  System.out.println("Empty: " + empty.toString()); 
//		  System.out.println("Empty size: " + empty.size());
//		  System.out.println("Empty is empty? : " + empty.isEmpty());
//		  
//		  System.out.println("One:" + one); System.out.println("One size: " +
//		  one.size()); System.out.println("One is empty? " + one.isEmpty());
//		  
//		  System.out.println("Multiple:" + multiple);
//		  System.out.println("Multiple size:" + multiple.size());
//		  System.out.println("Multiple is empty? " + multiple.isEmpty());
//		  
//		  empty.pop();//will throw an error one.pop(); multiple.pop();
//		
//		  one.pop();
//		  System.out.println("One (upon pop):" + one);
//		  System.out.println("One size: " + one.size());
//		  
//		  
//		  System.out.println("Multiple (upon pop):" + multiple);
//		  System.out.println("Multiple size (upon pop):" + multiple.size());
//		  
//		  multiple.push(77);
//		  multiple.pop(); 
//		  multiple.pop();
//		  System.out.println("Multiple(on push):" + multiple);
		 

//		System.out.println("\n QUEUE TESTING: \n");
//		Queue empty = new Queue();
//		Queue one = new Queue();
//		Queue multiple = new Queue();
//
//		one.enqueue(5);
//		multiple.enqueue(10);
//		multiple.enqueue(20);
//		multiple.enqueue(30);
//		multiple.enqueue(40);
////		multiple.enqueue(null);// this should throw an error message
////		multiple.insert(999, 3);// this should throw an error message
////		multiple.append(222);// this should throw an error message
////		multiple.remove(2);// this should throw an error message
//
//		System.out.println("Empty: " + empty); // ( note the implicit call to toString())
//		System.out.println("Empty size: " + empty.size());
//		System.out.println("Empty is empty? : " + empty.isEmpty());
//
//		System.out.println("One:" + one);
//		System.out.println("One size: " + one.size());
//		System.out.println("One is empty? " + one.isEmpty());
//
//		System.out.println("Multiple:" + multiple);
//		System.out.println("Multiple size:" + multiple.size());
//		System.out.println("Multiple is empty? " + multiple.isEmpty());
//
////		empty.dequeue();// this should throw an error
//		one.dequeue();
//		multiple.dequeue();
//		multiple.dequeue();
//		System.out.println("One (upon dequeue):" + one);
//		System.out.println("One size: " + one.size());
//		System.out.println("Multiple (upon dequeue):" + multiple);
//		System.out.println("Multiple size (upon dequeue):" + multiple.size());
//
//		multiple.enqueue(77);
//		System.out.println("Multiple(on enqueue):" + multiple);
	}
}
