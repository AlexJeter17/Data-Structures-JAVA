
public class ArrayStackClass<E> implements ArrayStackInterface {

	
	private E[] theData;    // This is the reference holder
    private int topOfStack = -1;

    // constants
    private static final int INITIAL_CAPACITY = 5;
	
    
	public ArrayStackClass() {
		
		this.theData = (E[]) new Object[this.INITIAL_CAPACITY];
		
	}
	
	public ArrayStackClass(int num) {
		
		this.theData = (E[]) new Object[num];
		
	}
    

	@Override
	public E pop() {
		
		E temp;
		
		temp = this.theData[topOfStack];
		
		this.theData[topOfStack] = null;
		
		topOfStack--;
		return temp;
	}

	@Override
	public E peek() {
		
		return this.theData[topOfStack];
	}

	@Override
	public boolean isEmpty() {

		if(this.topOfStack == -1) {
			return true;
		}
		return false;
	}
	
	@Override
	public void push(Object obj) {
		if(this.topOfStack == this.theData.length - 1) {
            // if the last element is at the location capacity, then it is full
            System.out.println("Stack Overflow"); // use reallocate like arrayList
            return;
        }
		 this.topOfStack++;
	     this.theData[topOfStack] = (E) obj;
	     return;
	}

	public String toString() {

		String s = "";

    	for (int i = 0; i <= this.topOfStack; i++) {

        	s += this.theData[i] + " | "; 

    	}
    	return s;

	}
	
	
}
