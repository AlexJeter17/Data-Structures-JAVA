
public class ArrayQueueClass<E> implements ArrayQueueInterface<E> {
	private E[] Q;
	private int front, rear, size, capacity;
	private final int DEFAULT_CAPACITY = 5;

	
	public ArrayQueueClass() {
		Q = (E[]) new Object[this.DEFAULT_CAPACITY];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
		this.capacity = this.DEFAULT_CAPACITY;
	}
	
	public ArrayQueueClass(int num) {
		
		this.capacity = num;
		Q = (E[]) new Object[this.capacity];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
		
	}
	
	
	
	@Override
	public void offer(E obj) {
		// TODO Auto-generated method stub
		
		if(isFull()) {
			System.out.println("Queue out of space; calling reallocate.");
			 reallocate();
			 this.offer(obj);
		}
		else {
			Q[rear] = obj;
			rear = (rear+1) % this.capacity;
			size++;
		}
		
	}

	private void reallocate() {
		// this method will double the size of Q
		this.capacity *= 2;
		this.rear = this.size % this.capacity; // Update rear
		E[] tempQ = (E[]) new Object[this.capacity];
		for(int i = front; i < front + size; i++) {
			tempQ[i] = Q[i];
		}
		this.Q = tempQ;
	}
	
	@Override
	public E poll() {
		
		if(isEmpty()) {
			System.out.println("Queue Underflow!");
			return null;
		}
		
		E temp = Q[front];
		front = (front + 1)% this.capacity;
		size--;
		return temp;
	}
	
	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (this.size == 0);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (this.size==this.capacity);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return this.Q[front];
	}
	
	public String toString() {
		String s = "";
		
		for(int i = front; i < front + size; i++) {
			s += Q[i % this.capacity] + " | ";
		}
		
		return s;
	}
	
}
