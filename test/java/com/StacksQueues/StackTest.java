import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackTest {

	static LinkedListClass<Integer> LinkedList;
	static private LinkedListNode<Integer> Node1;
	static private LinkedListNode<Integer> Node2;
	static private LinkedListNode<Integer> Node3;
	static private StackClass<Integer> stack;

	@BeforeClass
	public static void init() {
		//Passing key value
		Node1 = new LinkedListNode<Integer>(70);
		Node2 = new LinkedListNode<Integer>(30);
		Node3 = new LinkedListNode<Integer>(56);
		stack = new StackClass<Integer>();

		//Pushing to stack
		stack.push(Node1);
		stack.push(Node2);
		stack.push(Node3);

		//Display Stack
		stack.showStack();
	}

	//Checking for linking of nodes
	@Test
	public void WhenNode1LinkedToNode2ShouldReturnTrue() {
		assertTrue((Node2.getNextNode()).equals(Node1));
	}

	@Test
	public void WhenNode2LinkedToNode3ShouldReturnTrue() {
		assertTrue((Node3.getNextNode()).equals(Node2));
	}
}
