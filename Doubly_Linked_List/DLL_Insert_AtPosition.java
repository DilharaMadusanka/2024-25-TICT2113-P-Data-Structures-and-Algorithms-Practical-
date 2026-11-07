public class DLL_Insert_AtPosition{
	
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
	
	public void insertAtPosition(int data,int position){
		
		Node newNode = new Node(data);
		
		if(position < 1){
			System.out.println("Invalid Position ! ");
			return;
		}
		if(head == null){
			head = newNode;
			tail = newNode;
			return;
		}
		if(position == 1){
			newNode.next = head;
			head.prv = newNode;
			head = newNode;
			return;
		}
		Node current = head;
		for(int i = 1; i < position-1 && current != null; i++){
			current = current.next;
		}	
		if (current == null) {
          System.out.println("Position out of bounds!");
          return;
       }
	   newNode.next = current.next;
	   newNode.prv = current;

        if (current.next != null) {			
            current.next.prv = newNode;
        } else {	
            tail = newNode;
        }  
        current.next = newNode; 
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
		DLL_Insert_AtPosition list = new DLL_Insert_AtPosition();
		
		list.insertAtPosition(5,1);
		list.insertAtPosition(10,2);
		list.insertAtPosition(15,3);
		list.insertAtPosition(20,4);
		list.insertAtPosition(25,5);
		
		list.printList();
		
		list.insertAtPosition(67,3);
		
		list.printList();
	}
}