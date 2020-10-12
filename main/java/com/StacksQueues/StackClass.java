public class StackClass<Key> {

	private LinkedListClass<Key> linkedList;

	public StackClass() {
		linkedList=new LinkedListClass<>();
	}
	
	public void push(LinkedListNode<Key> newNode) {
		linkedList.add(newNode);
	}
	
	public LinkedListNode<Key> peek() {
		return (LinkedListNode<Key>) linkedList.headNode;
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
