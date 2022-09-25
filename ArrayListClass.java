
public class ArrayListClass<E> implements ArrayListInterface {
	private int size, capacity;
    private E[] myArray;
    private static final int INITIAL_CAPACITY = 10;
    
    
    public ArrayListClass(){
        
        this.capacity = this.INITIAL_CAPACITY;
        this.size = 0;
        myArray = (E[]) new Object[this.capacity];
        
    }
    
    public ArrayListClass(int capacity){
        
        this.capacity = capacity;
        this.size = 0;
        myArray = (E[]) new Object[this.capacity];
        
    }
    
	@Override
	public void add(Object a) {
		if(this.size < this.capacity){
            myArray[size] = (E) a;
            size++;
        }
        else{
            System.out.println("There is no spcae, calling reallocation method");
            this.reallocate();
            this.add(a);
        }
        
		
	}
	
	public void reallocate(){ // double the size of current arraylist
	    
        this.capacity *= 2;
        E[] Temp = (E[]) new Object[this.capacity];
        
        for(int i = 0; i < myArray.length; i++){
            Temp[i] = myArray[i];
        }
        this.myArray = Temp;
    }

	@Override
	public void add(Object a, int index) {
		if (index < 0 || index > this.size) {
    		System.out.println("Invalid Index!");
    		return;
    	}
    	else if(index == size) {
    		
    		this.add(a);
    		
    	}
    	else {
    		
    		if(this.size == this.capacity) {
    			this.reallocate();
    		}
    		
    		for (int i = size; i > index; i--) {
    			this.myArray[i] = this.myArray[i-1];
    			
    		}
    		
    		this.myArray[index] = (E) a;
    		this.size++;
    		
    	}
		
	}

	@Override
	public E remove(int index) {
		if (index < 0 || index > this.size) {
    		System.out.println("Invalid Index!");
    		return null;
    	}
    	
    	E temp = myArray[index];
    	
    	for(int i = index; i < size - 1; i++) {
    		this.myArray[i] = this.myArray[i+1];
    	}
    	this.size--;
    	
    	
        return temp;
	}

	@Override
	public E get(int index) { // Get object from specified index
    	
    	if (index < 0 || index > this.size) {
    		System.out.println("Invalid Index!");
    		return null;
    	}
    	
        return myArray[index];
    }

	@Override
	public void set(Object a, int index) {
		if (index < 0 || index > this.size) {
    		System.out.println("Invalid Index!");
    		return;
    	}
    	
    	myArray[index] = (E) a;
    	return;
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public int indexOf(Object a) {
		for(int i = 0; i < this.size; i++) {
    		if(myArray[i].equals(a)) {
    			return i;
    		}
    	}
		System.out.println(a + " is not in this ArrayList.");
    	return -1;
	}
	
	public String toString(){ // turn the array into a string.
        String s = "";
        
        for(int i = 0; i < this.size;i++){
        
            s+= myArray[i] + ", ";
            
        }
        
//        s += myArray[this.size];
        
        return s;
    }


}
