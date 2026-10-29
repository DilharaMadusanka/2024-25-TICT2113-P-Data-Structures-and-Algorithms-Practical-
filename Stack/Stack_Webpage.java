import java.util.Scanner;
public class Stack_Webpage{
	
	private int[] arrStack;
	private int top;
    private int capacity;

    public Stack_Webpage(int value){
		this.arrStack = new int[value];
		this.top = -1;
		this.capacity = value;
	}	
	
	public void push(int value){
		if(isFull()){
			System.out.println("Stack is Overflow!");
			return;
		}else{
			arrStack[++top] = value;
			System.out.println("push " + value);
		}
	}
	
	public void pop(){
		if(isEmpty()){
			System.out.println("Stack is Underflow!");
			return;
		}else{
			int oldTop = arrStack[top--];
			capacity-- ;
			System.out.println("pop " + oldTop);
		}
	}
	
	public void peek(){
		if(isEmpty()){
			System.out.println("Stack is Underflow!");
			return;
		}else{
			System.out.println("new top " + arrStack[top]);
		}
	}
	
	public boolean isFull(){
		return top == capacity - 1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}

   public static void main(String[] args){
	   Stack_Webpage s1 = new Stack_Webpage(5);
	   
	   s1.push(10);
	   s1.push(20);
	   s1.push(30);
	   s1.push(40);
	   s1.push(50);
	   s1.push(60);
	   
	   s1.pop();
	   s1.pop();
	   
	   s1.peek();
   }	
}
