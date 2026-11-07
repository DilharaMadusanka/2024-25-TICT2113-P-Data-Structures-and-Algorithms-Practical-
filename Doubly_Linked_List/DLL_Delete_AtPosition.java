public class DLL_Delete_AtPosition{
	
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
	
public void deletAtPosition(int position){
	  if(head == null){
		  System.out.println("List is Empty!");
		  return;
	  }
	  if(position < 1){
		 System.out.println("Invalid Position!");
		 return; 
	  }
	  if(position == 1){
		  head = head.next;
		  head.prv = null;
		  return;
	  }
	  Node current = head;
	  for(int i = 1;i < position&& current != null; i++){
		  current = current.next;
	  }
	  if (current == null) {
        System.out.println("Position out of bounds!");
        return;
    }
	  current.prv.next = current.next;
	  current.next.prv = current.prv;
	  
}	
public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("Null");
}
	
	public static void main(String [] args){
		DLL_Delete_AtPosition list = new DLL_Delete_AtPosition();
		
		list.insertAtFront(5);
		list.insertAtFront(0);
		list.insertAtFront(15);
		list.insertAtFront(20);
		list.insertAtFront(25);
		
		list.printList();
		list.deletAtPosition(2);
		list.printList();
	}
}