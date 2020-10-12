public class QueueClass<Key> {

	private LinkedListClass<Key> linkedList;
	public int queueSize;

	public QueueClass() {
		linkedList=new LinkedListClass<>();
		queueSize=0;
	}
	
	public void enqueue(LinkedListNode<Key> newNode) {
		linkedList.append(newNode);
		queueSize++;
	}
	
	public LinkedListNode<Key> dequeue() {
		queueSize--;
		if (!isEmpty()) return (LinkedListNode<Key>) linkedList.pop();
		else System.out.println("Queue is empty. Cannot dequeue.");
		return new LinkedListNode<Key>(null);
=======
		return (LinkedListNode<Key>) linkedList.pop();
	}
	
	public boolean isEmpty() {
		if (linkedList.headNode==null) return true;
		else return false;
	}
	
	public int size() {
		return queueSize;
	}
	
	public void showQueue() {
		System.out.println("Queue = ");
		System.out.println();
		System.out.print("Head->   ");
		LinkedListFunction<Key> tempNode=linkedList.headNode;
		do {
			System.out.print(tempNode.getKey());
			if (!tempNode.equals(linkedList.tailNode)) System.out.print("<--");
			tempNode=tempNode.getNextNode();
		}while(tempNode.getNextNode() != null);
		System.out.print(tempNode.getKey());
		System.out.println("   <- Tail");
	}
}
