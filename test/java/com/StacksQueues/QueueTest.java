import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
=======
import org.junit.Test;

public class QueueTest {

	static LinkedListClass<Integer> LinkedList;
	static private LinkedListNode<Integer> Node1;
	static private LinkedListNode<Integer> Node2;
	static private LinkedListNode<Integer> Node3;
	static private QueueClass<Integer> queue;

	@BeforeClass
	public static void init() {
		//Passing key value
		Node1 = new LinkedListNode<Integer>(56);
		Node2 = new LinkedListNode<Integer>(30);
		Node3 = new LinkedListNode<Integer>(70);
		queue = new QueueClass<Integer>();

		//Pushing to stack
		queue.enqueue(Node1);
		queue.enqueue(Node2);
		queue.enqueue(Node3);

		//Display Stack
		queue.showQueue();
	}

	//Checking for size of queue
	@Test
	public void t1CheckQueueSizeIsThree() {
		assertEquals(3, queue.queueSize);
	}

	//Checking for dequeue of head
	@Test
	public void t2WhenDequeueShouldReturnHeadElement() {
		assertEquals(Node1, queue.dequeue());
	}

	//Checking for size of queue
	@Test
	public void t3CheckQueueSizeIsTwo() {
		assertEquals(2, queue.queueSize);
	}

	//Checking for dequeue of second element
	@Test
	public void t4WhenDequeueShouldReturnSecondElement() {
		assertEquals(Node2, queue.dequeue());
	}

	//Checking for size of queue
	@Test
	public void t5CheckQueueSizeIsOne() {
		assertEquals(1, queue.queueSize);
	}

	//Checking for dequeue of tail
	@Test
	public void t6WhenDequeueShouldReturnHeadElement() {
		assertEquals(Node3, queue.dequeue());
	}
	
	//Checking for size of queue
	@Test
	public void t7CheckQueueSizeIsZero() {
		assertEquals(0, queue.queueSize);
	}

	//Checking for dequeue of tail
	@Test
	public void t8WhenDequeueShouldReturnError() {
		assertEquals(new LinkedListNode<Integer>(null), queue.dequeue());
=======
	//Checking for linking of nodes
	@Test
	public void WhenNode1LinkedToNode2ShouldReturnTrue() {
		assertTrue((Node1.getNextNode()).equals(Node2));
	}

	@Test
	public void WhenNode2LinkedToNode3ShouldReturnTrue() {
		assertTrue((Node2.getNextNode()).equals(Node3));
	}
}
