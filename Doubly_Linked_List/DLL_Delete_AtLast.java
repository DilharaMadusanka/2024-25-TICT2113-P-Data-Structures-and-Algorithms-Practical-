public class DLL_Delete_AtLast{
	
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
	
public void deletAtLast(){
	  if(head == null){
		  System.out.println("List is Empty!");
		  return;
	  }
	  if(head == tail){
		  head = null;
		  tail = null;
		  return;
	  }
	   tail = tail.prv;
	   tail.next = null;
	  
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
		DLL_Delete_AtLast list = new DLL_Delete_AtLast();
		
		list.insertAtFront(5);
		list.insertAtFront(0);
		list.insertAtFront(15);
		list.insertAtFront(20);
		list.insertAtFront(25);
		
		list.printList();
		list.deletAtLast();
		list.printList();
	}
}