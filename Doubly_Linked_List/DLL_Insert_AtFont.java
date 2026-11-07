public class DLL_Insert_AtFont{
	
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
	
public void insertAtFront(int data){	
   Node newNode = new Node(data);  
   if(head == null){
	   head = newNode;
	   tail = newNode;
   }else{
	   newNode.next = head;
	   head.prv = newNode;
	   head = newNode;
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
		DLL_Insert_AtFont list = new DLL_Insert_AtFont();
		
		list.insertAtFront(5);
		list.insertAtFront(10);
		list.insertAtFront(15);
		list.insertAtFront(20);
		list.insertAtFront(25);
		
		list.printList();
	}
}