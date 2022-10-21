// Interface for Linked List	
public interface LinkedListInterface<E> {

	public void add(int index, E item); // Add element to LL at specific index
	
	public E remove(int index); // remove element of LL at specific index

	public E get(int index); // Gets the node at a specific index
	
	public E set(int index, E newItem); // Sets the index to new value

	public int size(); // gets the current size of the Linked List
	
}
