package Notation;

public class LinkedStack implements Stack{
	StackNode top;
	
	public LinkedStack() {
		this.top = null;
	}

	@Override
	public boolean isEmpty() {
		return (top==null);
	}

	@Override
	public void push(char item) {
		StackNode node = new StackNode();
		node.item = item;
		node.next = top;
		top = node;
	}

	@Override
	public char pop() {
		if(isEmpty()){
			System.out.println("������ ����ֽ��ϴ�.");
			return 0;
		}else{
			StackNode node = top;
			top = node.next;			
			return node.item;
		}
	}

	@Override
	public void delete() {
		if(isEmpty()){
			System.out.println("������ ����ֽ��ϴ�.");
		}else{
			top = top.next;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()){
			System.out.println("������ ����ֽ��ϴ�.");
			return 0;
		}else{
			return top.item;
		}
	}
	
	public void printStack() {
		if(isEmpty()){
			System.out.println("������ ����ֽ��ϴ�.");
		}else{
			StackNode node = top;
			System.out.println("<<Stack>>");
			while(node.next!=null){
				System.out.println(node.item);
				node = node.next;
			}
			System.out.println(node.item);
			System.out.println();
		}
	}
}	
