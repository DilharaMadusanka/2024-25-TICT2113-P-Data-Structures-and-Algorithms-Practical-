import java.util.Scanner;
public class WebpageStack{
	
	private String[] history;
	private int top;
	private int capacity;
	
	public WebpageStack(){
		this.capacity = 10;
		this.history = new String[capacity];
		this.top = -1;
	}
	
	public void push(String url){
		if(isFull()){
			System.out.println("Browser History is full!");
			return;
		}else{
			history[++top] = url;
			System.out.println("Visited URL : " + url);
		}
	}
	public String pop(){
		if(isEmpty()){
			System.out.println("No previous history!");
			return null;
		}else{
			String previouspage = history[top--];
			return previouspage;
		}
	}
	public String peek(){
		if(isEmpty()){
			System.out.println("No page currently open");
			return null;
		}
		return history[top];
	}
	public boolean isEmpty(){
		return top == -1;
	}
	public boolean isFull(){
		return top == capacity - 1;
	}
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		
		WebpageStack browser = new WebpageStack();
		
		boolean running = true;
		
		while(running){
			
			System.out.println("\nCurrent Page" + browser.peek());
			System.out.println("1.Visit new webpage(push)");
			System.out.println("2.Go back (pop)");
			System.out.println("3.Chek Current page (peek)");
			System.out.println("4.Exit");
			System.out.print("Choose an option : ");
			
			int choise = s1.nextInt();
			s1.nextLine();
			
			switch(choise){
				case 1 :
				System.out.print("Enter URL : ");
				String url = s1.nextLine();
				browser.push(url);
				break;
				
				case 2 :
				String popedUrl = browser.pop();
				if(popedUrl != null){
					System.out.print("Going back from : " + popedUrl);
				}
				break;
				
				case 3 :
				System.out.print("you are currently viewing : " + browser.peek());
				break;
				
				case 4 :
				System.out.println("Browse close!");
				running = false;
				break;

                default:
				System.out.println("Invalid option , please try again !");
			}
		}
		s1.close();
	}
}
