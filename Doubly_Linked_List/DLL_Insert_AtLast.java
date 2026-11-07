public class DLL_Insert_AtLast{
	
	class Node{
		int data;
		Node next;
		Node prv;
		
		public Node(int data){
			this.data = data;			
			this.next = null;
			this.prv = null;
	}
}	
	public Node head = null;
	public Node tail = null;
	
	public void insertAtLast(int data){
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
			tail = newNode;
		}else{
			tail.next = newNode;
			newNode.prv = tail;
			tail = newNode;
		}
	}
	public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
	
	public static void main(String [] args){
		DLL_Insert_AtLast list = new DLL_Insert_AtLast();
		
		list.insertAtLast(5);
		list.insertAtLast(10);
		list.insertAtLast(15);
		list.insertAtLast(20);
		list.insertAtLast(25);
		
		list.printList();
	}
}