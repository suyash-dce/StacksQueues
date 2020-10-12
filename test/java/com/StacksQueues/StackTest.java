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
	}
}
