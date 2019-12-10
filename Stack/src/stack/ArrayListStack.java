package stack;

import java.util.ArrayList;

public class ArrayListStack {
	private int top;
	private ArrayList<Integer> itemArray;
	private int stackSize;
	
	public ArrayListStack(int stackSize) {
		top = -1;
		itemArray = new ArrayList<>(stackSize);
		this.stackSize = stackSize;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (stackSize -1) );
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("Inserting fail! Array Stack is full");
		}else {
			itemArray.add(++top,item);
			System.out.println("Inserted Item : " + item);
		}
	}
	
	public void pop() { // 스택의 톱에 있는 아이템 제거
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!");
			
		} else {
			itemArray.remove(top--);
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty!");
			return -1;
		}else {
			return itemArray.get(top);
		}
	}
}
