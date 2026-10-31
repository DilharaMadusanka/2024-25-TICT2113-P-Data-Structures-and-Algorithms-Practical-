public class Queue{
	
	int size;
	int []myQueue;
	int front;
	int rear;
	
	public Queue(int size){
		this.myQueue = new int[size];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty(){
		if(front == -1){
			return true;
		}else{
			return false;
		}
	}
	public void enqueue(int element){
		if(front == 0 && rear == size - 1){
			System.out.println("Queue is Full");
			return;
		}else{
			front = 0;
			rear++;
            myQueue[rear] = element;			
		}
	}
	public int dequeue(){
		
		int element;
		if(isEmpty()){
		   System.out.println("Queue is Empty!");
		   return -1;
		}else{
			element = myQueue[front];
			if(front >= rear){
				front =  -1;
				rear = -1;
			}else{
				front++;
			}
		System.out.println();
        System.out.println(element + "deleted.");
        return element;
		}
	}
	
	public void peek(){
		if(isEmpty()){
		   System.out.println("Queue is Empty!");
		   return;
		}else{
			System.out.println("The front element is :" + myQueue[front]);
		}
	}
	public void display(){
		if(isEmpty()){
		   System.out.println("Queue is Empty!");
		   return;
		}else{
			for(int i = front; i <= rear; i++){
				System.out.print(myQueue[i] + " ");
			}
		}
	}
  public static void main(String [] args){
	  Queue q = new Queue(6);
	  
	  q.enqueue(10);
	  q.enqueue(20);
	  q.enqueue(30);
	  q.enqueue(40);
	  q.enqueue(50);
	  q.enqueue(60);
	  
	  q.display();
	  
  }
}
