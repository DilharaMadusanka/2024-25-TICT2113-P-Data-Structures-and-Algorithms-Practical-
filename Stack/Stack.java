public class Stack{
	
	public int arr[];
	public int top;
	public int capacity;
	
	public Stack(int value){
		this.arr = new int[value];
		this.capacity = value;
		this.top = - 1;
	}
	
	public void push(int value){
		if(isFull()){
			System.out.println("Stack Overflow!");
			return;
		}
		top++;
		arr[top] = value;
		System.out.println("pushed " + value);	
	}
	
	public void pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow!");
			return;
		}
	    int temp = arr[top];
		top--;
		System.out.println("poped " + temp);	
	}
	
	public void peek(){
	  if(isEmpty()){
			System.out.println("Stack Underflow!");
			return;
	  }
	  System.out.println("peek value :" + arr[top]);
	  
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	public boolean isFull(){
		return top == capacity - 1;
	}
	public static void main(String[] args){
		Stack stack = new Stack(5);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.push(60);
		stack.peek();
		System.out.println("\n======================================\n");
        stack.pop();
		
		System.out.println("\n======================================\n");
        stack.peek();
		
		System.out.println("\n======================================\n");

		
	    System.out.println("\n======================================\n");

		
	    System.out.println("\n");
	}
}
