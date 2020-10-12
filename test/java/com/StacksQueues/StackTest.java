public class StackClass<Key> {

	private LinkedListClass<Key> linkedList;
	public int stackSize;

	public StackClass() {
		linkedList=new LinkedListClass<>();
		stackSize=0;
	}
	
	public void push(LinkedListNode<Key> newNode) {
		linkedList.add(newNode);
		stackSize++;
	}
	
	public LinkedListNode<Key> peek() {
		return (LinkedListNode<Key>) linkedList.headNode;
	}
	
	public LinkedListNode<Key> pop() {
		stackSize--;
		if (!isEmpty()) return (LinkedListNode<Key>) linkedList.pop();
		else System.out.println("Stack is empty. Cannot pop.");
		return new LinkedListNode<Key>(null);
	}
	
	public boolean isEmpty() {
		if (linkedList.headNode==null) return true;
		else return false;
	}
	
	public int size() {
		return stackSize;
	}
	
	public void showStack() {
		System.out.println("Stack -> ");
		System.out.println();
		LinkedListFunction<Key> tempNode=linkedList.headNode;
		do {
			System.out.println("|  "+tempNode.getKey()+"  |");
			if (!tempNode.equals(linkedList.tailNode)) {
				System.out.println("|   |  |");
				System.out.println("|   V  |");
			}
			tempNode=tempNode.getNextNode();
		}while(tempNode.getNextNode() != null);
		System.out.println("|  "+tempNode.getKey()+"  |");
		System.out.println("--------");
=======
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
