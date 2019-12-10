package stack;

public class StackClient {
	public static void main(String[] args) {
		ArrayListStack at = new ArrayListStack(10);
		
		for(int i = 0; i < 10; i++)
			at.push(i);
		System.out.println(at.peek());
		at.pop();
		System.out.println(at.peek());
	}
	
}
